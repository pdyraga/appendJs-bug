package bootstrap.liftweb

import net.liftmodules.JQueryModule
import net.liftweb._
import net.liftweb.http.js.jquery.JQueryArtifacts
import util._
import Helpers._

import common._
import http._
import sitemap._
import Loc._

class Boot {
  def boot {
    // where to search snippets
    LiftRules.addToPackages("com.ontheserverside")

    // Force the request to be UTF-8
    LiftRules.early.append(_.setCharacterEncoding("UTF-8"))

    LiftRules.jsArtifacts = JQueryArtifacts
    JQueryModule.InitParam.JQuery = JQueryModule.JQuery191
    JQueryModule.init()
  }
}
