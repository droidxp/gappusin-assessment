public class com.ansca.corona.events.ResizeEvent extends com.ansca.corona.events.Event {
	 /* .source "ResizeEvent.java" */
	 /* # instance fields */
	 private java.lang.String myCachesDir;
	 private java.lang.String myDocumentsDir;
	 private Integer myH;
	 private Integer myOrientation;
	 private java.lang.String myPackageName;
	 private java.lang.String mySystemCachesDir;
	 private java.lang.String myTemporaryDir;
	 private Integer myW;
	 /* # direct methods */
	 com.ansca.corona.events.ResizeEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .param p2, "documentsDir" # Ljava/lang/String; */
		 /* .param p3, "temporaryDir" # Ljava/lang/String; */
		 /* .param p4, "cachesDir" # Ljava/lang/String; */
		 /* .param p5, "systemCachesDir" # Ljava/lang/String; */
		 /* .param p6, "w" # I */
		 /* .param p7, "h" # I */
		 /* .param p8, "orientation" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 15 */
		 this.myPackageName = p1;
		 /* .line 16 */
		 this.myDocumentsDir = p2;
		 /* .line 17 */
		 this.myTemporaryDir = p3;
		 /* .line 18 */
		 this.myCachesDir = p4;
		 /* .line 19 */
		 this.mySystemCachesDir = p5;
		 /* .line 20 */
		 /* iput p6, p0, Lcom/ansca/corona/events/ResizeEvent;->myW:I */
		 /* .line 21 */
		 /* iput p7, p0, Lcom/ansca/corona/events/ResizeEvent;->myH:I */
		 /* .line 22 */
		 /* iput p8, p0, Lcom/ansca/corona/events/ResizeEvent;->myOrientation:I */
		 /* .line 23 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 /* .line 27 */
		 v0 = this.myPackageName;
		 v1 = this.myDocumentsDir;
		 v2 = this.myTemporaryDir;
		 v3 = this.myCachesDir;
		 v4 = this.mySystemCachesDir;
		 /* iget v5, p0, Lcom/ansca/corona/events/ResizeEvent;->myW:I */
		 /* iget v6, p0, Lcom/ansca/corona/events/ResizeEvent;->myH:I */
		 /* iget v7, p0, Lcom/ansca/corona/events/ResizeEvent;->myOrientation:I */
		 /* invoke-static/range {v0 ..v7}, Lcom/ansca/corona/JavaToNativeShim;->resize(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V */
		 /* .line 28 */
		 return;
	 } // .end method
