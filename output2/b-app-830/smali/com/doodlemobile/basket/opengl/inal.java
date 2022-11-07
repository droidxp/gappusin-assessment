public class inal extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* # interfaces */
	 /* # static fields */
	 private static final com.doodlemobile.basket.opengl.f b;
	 /* # instance fields */
	 private com.doodlemobile.basket.m a;
	 private Boolean c;
	 private com.doodlemobile.basket.opengl.d d;
	 private com.doodlemobile.basket.opengl.p e;
	 private com.doodlemobile.basket.opengl.o f;
	 private com.doodlemobile.basket.opengl.q g;
	 private com.doodlemobile.basket.opengl.j h;
	 private Integer i;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/doodlemobile/basket/opengl/f; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/opengl/f;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/opengl/l;->c:Z */
		 (( com.doodlemobile.basket.opengl.l ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/opengl/l;->getHolder()Landroid/view/SurfaceHolder;
		 int v1 = 2; // const/4 v1, 0x2
		 int v1 = 4; // const/4 v1, 0x4
		 this.a = p2;
		 return;
	 } // .end method
	 static Integer a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/opengl/l;->i:I */
	 } // .end method
	 static Boolean a ( Object p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lcom/doodlemobile/basket/opengl/l;->c:Z */
	 } // .end method
	 static com.doodlemobile.basket.opengl.f b ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.doodlemobile.basket.opengl.l.b;
	 } // .end method
	 static com.doodlemobile.basket.opengl.p b ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 static com.doodlemobile.basket.opengl.o c ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.f;
	 } // .end method
	 private void c ( ) {
		 /* .locals 2 */
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v0, Ljava/lang/IllegalStateException; */
			 final String v1 = "setRenderer has already been called for this instance."; // const-string v1, "setRenderer has already been called for this instance."
			 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
		 } // :cond_0
		 return;
	 } // .end method
	 static Integer d ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/opengl/l;->i:I */
	 } // .end method
	 static com.doodlemobile.basket.opengl.q e ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.g;
	 } // .end method
	 static com.doodlemobile.basket.opengl.j f ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.h;
	 } // .end method
	 static Boolean g ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/opengl/l;->c:Z */
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/l;->c()V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/doodlemobile/basket/opengl/l;->i:I */
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/opengl/l;->c()V */
		 v0 = this.e;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lcom/doodlemobile/basket/opengl/i; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/opengl/i;-><init>(Lcom/doodlemobile/basket/opengl/l;)V */
		 this.e = v0;
	 } // :cond_0
	 v0 = this.f;
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Lcom/doodlemobile/basket/opengl/g; */
	 /* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/opengl/g;-><init>(Lcom/doodlemobile/basket/opengl/l;)V */
	 this.f = v0;
} // :cond_1
v0 = this.g;
/* if-nez v0, :cond_2 */
/* new-instance v0, Lcom/doodlemobile/basket/opengl/e; */
/* invoke-direct {v0}, Lcom/doodlemobile/basket/opengl/e;-><init>()V */
this.g = v0;
} // :cond_2
/* new-instance v0, Lcom/doodlemobile/basket/opengl/d; */
/* invoke-direct {v0, p0, p1}, Lcom/doodlemobile/basket/opengl/d;-><init>(Lcom/doodlemobile/basket/opengl/l;Lcom/doodlemobile/basket/opengl/h;)V */
this.d = v0;
v0 = this.d;
(( com.doodlemobile.basket.opengl.d ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/d;->start()V
return;
} // .end method
protected final void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/view/SurfaceView;->onDetachedFromWindow()V */
v0 = this.d;
(( com.doodlemobile.basket.opengl.d ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/d;->c()V
return;
} // .end method
public final Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = this.a;
(( com.doodlemobile.basket.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/m;->a(Landroid/view/MotionEvent;)V
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
v0 = this.d;
(( com.doodlemobile.basket.opengl.d ) v0 ).a ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Lcom/doodlemobile/basket/opengl/d;->a(II)V
return;
} // .end method
public final void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.d;
(( com.doodlemobile.basket.opengl.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/d;->a()V
return;
} // .end method
public final void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.d;
(( com.doodlemobile.basket.opengl.d ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/opengl/d;->b()V
return;
} // .end method
