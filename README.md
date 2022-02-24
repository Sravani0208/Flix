# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).


📝 `NOTE - PASTE PART 2 SNIPPET HERE:` Paste the README template for part 2 of this assignment here at the top. This will show a history of your development process, which users stories you completed and how your app looked and functioned at each step.

---

## Flix Part 1
Flix is an app that allows users to browse movies from the [The Movie Database API]

Submitted by: Naga Sravani Epparla

Time spent: 6 hours spent in total

### User Stories

#### REQUIRED (10pts)
- [X ] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [ ] (2pts) Views should be responsive for both landscape/portrait mode.
   - [ ] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [ ] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ] (2pts) Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ] (2pts) Improved the user interface by experimenting with styling and coloring.
- [ ] (2pts) For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF

<img src="https://github.com/Sravani0208/Flix/blob/master/Flixwalkthrough.gif" width=250><br>

### Notes
1.While adding the library of coc.codepath.asynchttpclient the giddle build sync but while I add the library in the mainactivity as import com.codepath.AsyncHttpClient
it is not imported. Later I have changed the version.
2.While I bebug the app, the network shows an error message, please find the screenshot below. java.net.SocketException: socket failed: EPERM (Operation not permitted)
I have reinstalled the app and it worked as expected.
### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
