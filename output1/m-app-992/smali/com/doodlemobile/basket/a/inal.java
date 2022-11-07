public class inal extends com.doodlemobile.basket.a.a {
	 /* # static fields */
	 private static com.doodlemobile.basket.a.f d;
	 /* # instance fields */
	 private com.doodlemobile.basket.a.f c;
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
	 public static com.doodlemobile.basket.a.f a ( ) {
		 /* .locals 2 */
		 v0 = com.doodlemobile.basket.a.f.d;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/basket/a/f; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/a/f;-><init>()V */
	 } // :goto_0
} // :cond_0
v0 = com.doodlemobile.basket.a.f.d;
v1 = this.c;
int v1 = 0; // const/4 v1, 0x0
this.c = v1;
} // .end method
public static void a ( Object p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = com.doodlemobile.basket.a.f.d;
this.c = v0;
return;
} // .end method
/* # virtual methods */
public final void a ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1 ) {
/* .locals 4 */
int v3 = 2; // const/4 v3, 0x2
/* iput v3, p0, Lcom/doodlemobile/basket/a/f;->b:I */
/* const-wide/16 v0, 0x10 */
com.doodlemobile.basket.opengl.NativeBuffer .a ( v0,v1 );
this.a = v0;
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
v0 = this.a;
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v0 ).a ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.doodlemobile.basket.opengl.NativeBuffer ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IF)V
return;
} // .end method
