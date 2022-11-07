class inal implements android.sax.EndTextElementListener {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lzongfuscated/w; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final com.zong.android.engine.xml.pojo.lookup.ZongPricePoint a; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final void end ( java.lang.String p0 ) {
/* .locals 2 */
v0 = this.a;
java.lang.Float .valueOf ( p1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v0 ).setExchangeRate ( v1 ); // invoke-virtual {v0, v1}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->setExchangeRate(F)V
return;
} // .end method
