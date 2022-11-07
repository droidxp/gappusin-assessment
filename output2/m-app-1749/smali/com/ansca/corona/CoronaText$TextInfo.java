class com.ansca.corona.CoronaText$TextInfo {
	 /* .source "CoronaText.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaText; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "TextInfo" */
} // .end annotation
/* # instance fields */
android.text.TextPaint myTextPaint;
android.graphics.Typeface myTypeface;
/* # direct methods */
 com.ansca.corona.CoronaText$TextInfo ( ) {
/* .locals 2 */
/* .param p1, "typeface" # Landroid/graphics/Typeface; */
/* .prologue */
/* const/16 v1, 0xff */
/* .line 43 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 44 */
this.myTypeface = p1;
/* .line 45 */
/* new-instance v0, Landroid/text/TextPaint; */
/* invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V */
this.myTextPaint = v0;
/* .line 46 */
v0 = this.myTextPaint;
(( android.text.TextPaint ) v0 ).setARGB ( v1, v1, v1, v1 ); // invoke-virtual {v0, v1, v1, v1, v1}, Landroid/text/TextPaint;->setARGB(IIII)V
/* .line 47 */
v0 = this.myTextPaint;
int v1 = 1; // const/4 v1, 0x1
(( android.text.TextPaint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V
/* .line 48 */
v0 = this.myTextPaint;
v1 = android.graphics.Paint$Align.LEFT;
(( android.text.TextPaint ) v0 ).setTextAlign ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 49 */
v0 = this.myTextPaint;
(( android.text.TextPaint ) v0 ).setTypeface ( p1 ); // invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 50 */
return;
} // .end method
