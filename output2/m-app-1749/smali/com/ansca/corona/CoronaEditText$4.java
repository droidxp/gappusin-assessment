class com.ansca.corona.CoronaEditText$4 extends android.text.method.TextKeyListener {
	 /* .source "CoronaEditText.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaEditText;-><init>(Landroid/content/Context;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaEditText this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaEditText$4 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Landroid/text/method/TextKeyListener$Capitalize; */
/* .param p3, "x1" # Z */
/* .prologue */
/* .line 121 */
this.this$0 = p1;
/* invoke-direct {p0, p2, p3}, Landroid/text/method/TextKeyListener;-><init>(Landroid/text/method/TextKeyListener$Capitalize;Z)V */
return;
} // .end method
/* # virtual methods */
public Integer getInputType ( ) {
/* .locals 2 */
/* .prologue */
/* .line 128 */
int v0 = 1; // const/4 v0, 0x1
/* .line 129 */
/* .local v0, "type":I */
v1 = this.this$0;
v1 = com.ansca.corona.CoronaEditText .access$700 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 130 */
	 /* or-int/lit16 v0, v0, 0x80 */
	 /* .line 133 */
} // :goto_0
v1 = com.ansca.corona.Controller .getAndroidVersionSpecific ( );
/* or-int/2addr v0, v1 */
/* .line 134 */
/* .line 132 */
} // :cond_0
/* or-int/lit8 v0, v0, 0x0 */
} // .end method
