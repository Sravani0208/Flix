package com.example.flix

import android.content.Context
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

const val MOVIE_EXTRA= "MOVIE_EXTRA"
private const val  TAG= "MovieAdapter"
class MovieAdaptor(private val context: Context, private val movies: List<Movie>)
     :RecyclerView.Adapter<MovieAdaptor.ViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view= LayoutInflater.from(context).inflate(R.layout.item_movie,parent, false)
         return ViewHolder(view)
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val movie=movies[position]
         holder.bind(movie)
     }

     override fun getItemCount()= movies.size

     inner class  ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
         private val ivPoster=itemView.findViewById<ImageView>(R.id.ivPoster)
         private val tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
         private val tvOverview=itemView.findViewById<TextView>(R.id.tvOverview)

         init {
             itemView.setOnClickListener(this)

         }

         fun bind(movie: Movie){
             tvTitle.text=movie.title
             tvOverview.text=movie.overview
             Glide.with(context).load(movie.posterImageUrl).into(ivPoster)

         }

         override fun onClick(p0: View?) {
             //notify particular movie which was clicked
             val movie= movies[adapterPosition]

             //use the intent system to navigate to the new activity
             val intent= Intent(context,DetailActivity::class.java)
             intent.putExtra(MOVIE_EXTRA, movie)
             context.startActivity(intent)
         }
     }


 }
