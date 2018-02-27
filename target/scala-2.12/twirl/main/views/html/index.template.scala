
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.120*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
         
          <th>ID</th>
          <th>Name</th>
    
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*40.10*/for(p<-products) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
          """),format.raw/*41.11*/("""<tr>
              """),_display_(/*42.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*42.104*/ {_display_(Seq[Any](format.raw/*42.106*/("""
                """),format.raw/*43.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*43.72*/(p.getId + ".jpg")),format.raw/*43.90*/(""""/></td>
            """)))}/*44.15*/else/*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
                """),format.raw/*45.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*46.14*/("""
            """),format.raw/*47.13*/("""<td class="numeric">"""),_display_(/*47.34*/p/*47.35*/.getId),format.raw/*47.41*/("""</td>
            <td><a href=""""),_display_(/*48.27*/routes/*48.33*/.HomeController.productDetails(p.getId)),format.raw/*48.72*/("""">
                """),_display_(/*49.18*/p/*49.19*/.getName),format.raw/*49.27*/("""</td>
               </a>
           
            <td>"""),_display_(/*52.18*/p/*52.19*/.getDescription),format.raw/*52.34*/("""</td>
            <td  class="numeric">"""),_display_(/*53.35*/p/*53.36*/.getStock),format.raw/*53.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*54.37*/("%.2f".format(p.getPrice))),format.raw/*54.64*/("""</td>
            <td>
              <a href=""""),_display_(/*56.25*/routes/*56.31*/.HomeController.updateProduct(p.getId)),format.raw/*56.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*60.25*/routes/*60.31*/.HomeController.deleteProduct(p.getId)),format.raw/*60.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*65.10*/("""
      """),format.raw/*66.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*71.17*/routes/*71.23*/.HomeController.addProduct()),format.raw/*71.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 27 14:45:34 GMT 2018
                  SOURCE: /home/wdd/webapps/lab2/app/views/index.scala.html
                  HASH: 22793d7355f39eae93cd280f5d39e4f0dbec2e59
                  MATRIX: 1023->1|1237->119|1265->122|1294->143|1333->145|1361->147|1543->302|1558->308|1603->332|1681->384|1717->404|1757->406|1793->415|1830->425|1845->431|1896->461|1950->488|1960->489|1989->497|2028->508|2076->529|2086->530|2126->549|2184->577|2216->582|2360->700|2401->732|2441->734|2477->743|2549->788|2563->793|2599->808|2635->817|2679->831|2713->838|2994->1092|3026->1108|3066->1110|3105->1121|3152->1141|3250->1229|3291->1231|3336->1248|3418->1303|3457->1321|3498->1344|3511->1349|3550->1350|3595->1367|3713->1454|3754->1467|3802->1488|3812->1489|3839->1495|3898->1527|3913->1533|3973->1572|4020->1592|4030->1593|4059->1601|4141->1656|4151->1657|4187->1672|4254->1712|4264->1713|4294->1722|4363->1764|4411->1791|4485->1838|4500->1844|4559->1882|4756->2052|4771->2058|4830->2096|5050->2285|5084->2292|5159->2340|5174->2346|5223->2374|5356->2477
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|84->52|84->52|84->52|85->53|85->53|85->53|86->54|86->54|88->56|88->56|88->56|92->60|92->60|92->60|97->65|98->66|103->71|103->71|103->71|109->77
                  -- GENERATED --
              */
          