This is a small application reproducing bug about `S.appendJs` not working for Comets in Lift 2.6. The Lift 3.0-RC1 seems not affected.

The `ListComet` is a Comet that renders a list and each time list gets updated (button is clicked), JS Alert should pop up:

```
val listRenderer =  SHtml.idMemoize { renderer =>
  S.appendJs(Alert("List reloaded"))

  ".item" #> items.map { item =>
    "^ *" #> item
  }
}
```

To test it, please start a Jetty (`jetty:start`) and go to http://localhost:8080/index.html
As you can see, when you click on "Reload" button the list gets reloaded but JS Alert is not showing up.

Now, please open http://localhost:8080/index2.html that is controlled by `NonCometList` snippet. 
It's just a snippet with exactly the same rendering logic as `ListComet`. 
You'll notice that each time you click "Reload" on `index2.html` JS alert shows up.

You can build this project both for Lift 2.6 and 3.0-RC1 which does not seem to be affected by bug. Just change the versions in `build.sbt`.
