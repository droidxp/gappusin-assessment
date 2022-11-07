class com.ansca.corona.NativeToJavaBridge$LoadBitmapResult {
	 /* .source "NativeToJavaBridge.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/NativeToJavaBridge; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "LoadBitmapResult" */
} // .end annotation
/* # instance fields */
private android.graphics.Bitmap fBitmap;
private Float fScaleFactor;
final com.ansca.corona.NativeToJavaBridge this$0; //synthetic
/* # direct methods */
public com.ansca.corona.NativeToJavaBridge$LoadBitmapResult ( ) {
/* .locals 0 */
/* .param p2, "bitmap" # Landroid/graphics/Bitmap; */
/* .param p3, "scaleFactor" # F */
/* .prologue */
/* .line 628 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 629 */
this.fBitmap = p2;
/* .line 630 */
/* iput p3, p0, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->fScaleFactor:F */
/* .line 631 */
return;
} // .end method
/* # virtual methods */
public android.graphics.Bitmap getBitmap ( ) {
/* .locals 1 */
/* .prologue */
/* .line 638 */
v0 = this.fBitmap;
} // .end method
public Float getScaleFactor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 642 */
/* iget v0, p0, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->fScaleFactor:F */
} // .end method
public Boolean wasSuccessful ( ) {
/* .locals 1 */
/* .prologue */
/* .line 634 */
v0 = this.fBitmap;
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
