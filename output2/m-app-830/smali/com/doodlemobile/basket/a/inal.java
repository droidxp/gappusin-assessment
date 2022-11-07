public class inal extends com.doodlemobile.basket.a.a {
	 /* # static fields */
	 private static com.doodlemobile.basket.a.b e;
	 /* # instance fields */
	 private Float c;
	 private com.doodlemobile.basket.a.b d;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/a/a;-><init>()V */
		 return;
	 } // .end method
	 public static com.doodlemobile.basket.a.b a ( ) {
		 /* .locals 2 */
		 v0 = com.doodlemobile.basket.a.b.e;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/basket/a/b; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/a/b;-><init>()V */
	 } // :goto_0
} // :cond_0
v0 = com.doodlemobile.basket.a.b.e;
v1 = this.d;
int v1 = 0; // const/4 v1, 0x0
this.d = v1;
} // .end method
public static void a ( Object p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = com.doodlemobile.basket.a.b.e;
this.d = v0;
return;
} // .end method
/* # virtual methods */
public final void a ( Float p0 ) {
/* .locals 7 */
/* iput p1, p0, Lcom/doodlemobile/basket/a/b;->c:F */
/* const/16 v0, 0xb4 */
/* iput v0, p0, Lcom/doodlemobile/basket/a/b;->b:I */
/* iget v0, p0, Lcom/doodlemobile/basket/a/b;->b:I */
/* mul-int/lit8 v0, v0, 0x8 */
/* int-to-long v0, v0 */
com.doodlemobile.basket.opengl.NativeBuffer .a ( v0,v1 );
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* move v6, v1 */
/* move v1, v0 */
/* move v0, v6 */
} // :goto_0
/* iget v2, p0, Lcom/doodlemobile/basket/a/b;->b:I */
/* mul-int/lit8 v2, v2, 0x2 */
/* if-ge v0, v2, :cond_0 */
v2 = this.a;
/* add-int/lit8 v3, v0, 0x0 */
/* float-to-double v4, v1 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v4, v4 */
/* mul-float/2addr v4, p1 */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
v2 = this.a;
/* add-int/lit8 v3, v0, 0x1 */
/* float-to-double v4, v1 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v4, v4 */
/* mul-float/2addr v4, p1 */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
/* float-to-double v1, v1 */
/* const-wide v3, 0x3fa1df46a2529d39L # 0.03490658503988659 */
/* add-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* add-int/lit8 v0, v0, 0x2 */
} // :cond_0
return;
} // .end method
