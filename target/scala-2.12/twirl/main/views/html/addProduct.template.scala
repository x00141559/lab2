
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.85*/("""
      """),_display_(/*14.8*/for((value, name) <- Category.options) yield /*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
          """),format.raw/*15.11*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*15.61*/value),format.raw/*15.66*/(""""
          />"""),_display_(/*16.14*/name),format.raw/*16.18*/("""<br>
      """)))}),format.raw/*17.8*/("""
        """),_display_(/*18.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*18.99*/("""
        """),_display_(/*19.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*19.87*/("""
        """),_display_(/*20.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*20.87*/("""

        """),_display_(/*22.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.74*/("""
        
        """),format.raw/*24.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add/Product" class="btn btn-primary">
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.HomeController.index(0)),format.raw/*29.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*33.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 14:00:37 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/addProduct.scala.html
                  HASH: 3c7b274a223c530e7eda72bac6f2a27671f08d92
                  MATRIX: 985->1|1118->63|1163->61|1190->79|1217->81|1249->105|1288->107|1319->112|1387->155|1543->303|1582->305|1619->342|1656->352|1669->356|1700->366|1738->377|1834->452|1868->460|1922->498|1962->500|2001->511|2078->561|2104->566|2146->581|2171->585|2213->597|2250->607|2360->696|2397->706|2495->783|2532->793|2630->870|2668->881|2753->945|2798->963|3069->1207|3084->1213|3129->1237|3277->1355
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|41->9|41->9|42->10|43->11|43->11|43->11|45->13|45->13|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|49->17|50->18|50->18|51->19|51->19|52->20|52->20|54->22|54->22|56->24|61->29|61->29|61->29|65->33
                  -- GENERATED --
              */
          