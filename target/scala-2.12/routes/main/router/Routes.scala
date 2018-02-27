
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab2/conf/routes
// @DATE:Tue Feb 27 11:22:01 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:19
  LoginController_2: controllers.LoginController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:19
    LoginController_2: controllers.LoginController,
    // @LINE:25
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """controllers.HomeController.customer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomer""", """controllers.HomeController.addCustomer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomerSubmit""", """controllers.HomeController.addCustomerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteCustomer(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCustomer(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.HomeController.productDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_customer1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_HomeController_customer1_invoker = createInvoker(
    HomeController_0.customer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "customer",
      Nil,
      "GET",
      this.prefix + """customer""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_addProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct2_invoker = createInvoker(
    HomeController_0.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_addProductSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProductSubmit3_invoker = createInvoker(
    HomeController_0.addProductSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_addCustomer4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomer")))
  )
  private[this] lazy val controllers_HomeController_addCustomer4_invoker = createInvoker(
    HomeController_0.addCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """addCustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_addCustomerSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addCustomerSubmit5_invoker = createInvoker(
    HomeController_0.addCustomerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomerSubmit",
      Nil,
      "POST",
      this.prefix + """addCustomerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_deleteProduct6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct6_invoker = createInvoker(
    HomeController_0.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_deleteCustomer7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCustomer7_invoker = createInvoker(
    HomeController_0.deleteCustomer(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteCustomer",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """delCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_updateProduct8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct8_invoker = createInvoker(
    HomeController_0.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_updateCustomer9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomer9_invoker = createInvoker(
    HomeController_0.updateCustomer(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomer",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_productDetails10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_productDetails10_invoker = createInvoker(
    HomeController_0.productDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "productDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_login11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login11_invoker = createInvoker(
    LoginController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_loginSubmit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit12_invoker = createInvoker(
    LoginController_2.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LoginController_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout13_invoker = createInvoker(
    LoginController_2.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_HomeController_updateProductSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProductSubmit14_invoker = createInvoker(
    HomeController_0.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(cat))
      }
  
    // @LINE:7
    case controllers_HomeController_customer1_route(params@_) =>
      call { 
        controllers_HomeController_customer1_invoker.call(HomeController_0.customer)
      }
  
    // @LINE:8
    case controllers_HomeController_addProduct2_route(params@_) =>
      call { 
        controllers_HomeController_addProduct2_invoker.call(HomeController_0.addProduct)
      }
  
    // @LINE:9
    case controllers_HomeController_addProductSubmit3_route(params@_) =>
      call { 
        controllers_HomeController_addProductSubmit3_invoker.call(HomeController_0.addProductSubmit)
      }
  
    // @LINE:10
    case controllers_HomeController_addCustomer4_route(params@_) =>
      call { 
        controllers_HomeController_addCustomer4_invoker.call(HomeController_0.addCustomer)
      }
  
    // @LINE:11
    case controllers_HomeController_addCustomerSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_addCustomerSubmit5_invoker.call(HomeController_0.addCustomerSubmit)
      }
  
    // @LINE:12
    case controllers_HomeController_deleteProduct6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct6_invoker.call(HomeController_0.deleteProduct(id))
      }
  
    // @LINE:13
    case controllers_HomeController_deleteCustomer7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteCustomer7_invoker.call(HomeController_0.deleteCustomer(id))
      }
  
    // @LINE:14
    case controllers_HomeController_updateProduct8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct8_invoker.call(HomeController_0.updateProduct(id))
      }
  
    // @LINE:15
    case controllers_HomeController_updateCustomer9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateCustomer9_invoker.call(HomeController_0.updateCustomer(id))
      }
  
    // @LINE:17
    case controllers_HomeController_productDetails10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_productDetails10_invoker.call(HomeController_0.productDetails(id))
      }
  
    // @LINE:19
    case controllers_LoginController_login11_route(params@_) =>
      call { 
        controllers_LoginController_login11_invoker.call(LoginController_2.login)
      }
  
    // @LINE:20
    case controllers_LoginController_loginSubmit12_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit12_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:21
    case controllers_LoginController_logout13_route(params@_) =>
      call { 
        controllers_LoginController_logout13_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:23
    case controllers_HomeController_updateProductSubmit14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProductSubmit14_invoker.call(HomeController_0.updateProductSubmit(id))
      }
  
    // @LINE:25
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
