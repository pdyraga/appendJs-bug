package com.ontheserverside.snippet

import net.liftweb.http._
import net.liftweb.http.js.JsCmds.Alert
import net.liftweb.util._
  import Helpers._

class NonCometList {
  def render = {
    "#list" #> listRenderer &
    "#reload" #> SHtml.ajaxButton("Reload list", () => listRenderer.setHtml())
  }

  val listRenderer =  SHtml.idMemoize { renderer =>
    S.appendJs(Alert("List reloaded"))

    ".item" #> items.map { item =>
      "^ *" #> item
    }
  }

  val items = List("rambo", "batman", "borat")
}
