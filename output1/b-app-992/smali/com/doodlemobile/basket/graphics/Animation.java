public abstract class com.doodlemobile.basket.graphics.Animation {
	 /* # instance fields */
	 protected Long f;
	 /* # direct methods */
	 public com.doodlemobile.basket.graphics.Animation ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/graphics/Animation;->f:J */
		 return;
	 } // .end method
	 public static com.doodlemobile.basket.graphics.Animation a ( Object p0, Integer p1 ) {
		 /* .locals 1 */
		 /* check-cast v0, Lcom/doodlemobile/basket/graphics/Animation; */
		 /* if-nez v0, :cond_0 */
		 com.doodlemobile.basket.graphics.Animation .a ( p0,v0 );
	 } // :cond_0
} // .end method
private static com.doodlemobile.basket.graphics.Animation a ( Object p0, org.xmlpull.v1.XmlPullParser p1 ) {
	 /* .locals 5 */
	 int v4 = 0; // const/4 v4, 0x0
	 int v3 = 2; // const/4 v3, 0x2
	 android.util.Xml .asAttributeSet ( p1 );
} // :cond_0
	 v1 = try { // :try_start_0
	 /* if-eq v1, v3, :cond_1 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-ne v1, v2, :cond_0 */
} // :cond_1
/* if-eq v1, v3, :cond_2 */
/* new-instance v0, Landroid/view/InflateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": No start tag found!"; // const-string v2, ": No start tag found!"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
(( org.xmlpull.v1.XmlPullParserException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
(( android.view.InflateException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw v1 */
} // :cond_2
try { // :try_start_1
final String v2 = "Animation"; // const-string v2, "Animation"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 int v1 = 0; // const/4 v1, 0x0
	 final String v2 = "class"; // const-string v2, "class"
} // :cond_3
final String v2 = "DGTileAnimation"; // const-string v2, "DGTileAnimation"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
	 /* new-instance v1, Lcom/doodlemobile/basket/graphics/DGTileAnimation; */
	 /* invoke-direct {v1, p0, v0}, Lcom/doodlemobile/basket/graphics/DGTileAnimation;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_4
	 (( com.doodlemobile.basket.graphics.Animation ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lcom/doodlemobile/basket/graphics/Animation;->a(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
} // :cond_4
} // :cond_5
final String v2 = "DTileAnimation"; // const-string v2, "DTileAnimation"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* new-instance v1, Lcom/doodlemobile/basket/graphics/DTileAnimation; */
/* invoke-direct {v1, p0, v0}, Lcom/doodlemobile/basket/graphics/DTileAnimation;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
/* :try_end_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ": "; // const-string v3, ": "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
(( android.view.InflateException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw v1 */
} // :cond_6
/* move-object v1, v4 */
} // .end method
protected static native void callrender ( Long p0, Long p1, Integer p2, Integer p3, Float p4, Float p5, Float p6, Float p7 ) {
} // .end method
protected static native void callrender1 ( Long p0, Long p1, Integer p2, Integer p3, Float p4, Float p5, Float p6, Float p7 ) {
} // .end method
private static native void releaseNativeObject ( Long p0 ) {
} // .end method
/* # virtual methods */
public abstract com.doodlemobile.basket.graphics.i a ( ) {
} // .end method
public void a ( com.doodlemobile.basket.math.MatrixStack p0, Integer p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 0 */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
protected void a ( org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1 ) {
/* .locals 0 */
return;
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
protected final void finalize ( ) {
/* .locals 4 */
/* const-wide/16 v2, 0x0 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/Animation;->f:J */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/Animation;->f:J */
com.doodlemobile.basket.graphics.Animation .releaseNativeObject ( v0,v1 );
/* iput-wide v2, p0, Lcom/doodlemobile/basket/graphics/Animation;->f:J */
} // :cond_0
return;
} // .end method
