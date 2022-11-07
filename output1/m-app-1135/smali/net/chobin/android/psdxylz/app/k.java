public abstract class net.chobin.android.psdxylz.app.k extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback implements java.lang.Runnable {
	 /* # interfaces */
	 /* # static fields */
	 public static Integer a;
	 public static java.lang.Thread a;
	 public static Boolean a;
	 public static Integer b;
	 /* # instance fields */
	 public Float a;
	 public android.content.Context a;
	 public android.os.Handler a;
	 public android.view.SurfaceHolder a;
	 public net.chobin.android.psdxylz.app.f a;
	 public Float b;
	 public Float c;
	 public Float d;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.k ( ) {
		 /* .locals 2 */
		 /* const/16 v0, 0x28 */
		 /* const/16 v0, 0x3e8 */
		 /* div-int/2addr v0, v1 */
		 int v0 = 1; // const/4 v0, 0x1
		 net.chobin.android.psdxylz.app.k.a = (v0!= 0);
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.k ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 this.a = p1;
		 v0 = this.a;
		 final String v1 = "window"; // const-string v1, "window"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/WindowManager; */
		 /* new-instance v1, Landroid/util/DisplayMetrics; */
		 /* invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V */
		 (( android.view.Display ) v0 ).getMetrics ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
		 /* iget v0, v1, Landroid/util/DisplayMetrics;->xdpi:F */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->a:F */
		 /* iget v0, v1, Landroid/util/DisplayMetrics;->ydpi:F */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->b:F */
		 (( net.chobin.android.psdxylz.app.k ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/k;->getHolder()Landroid/view/SurfaceHolder;
		 this.a = v0;
		 v0 = this.a;
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/f; */
		 /* invoke-direct {v0}, Lnet/chobin/android/psdxylz/app/f;-><init>()V */
		 this.a = v0;
		 v0 = this.a;
		 /* check-cast v0, Lnet/chobin/android/psdxylz/app/a; */
		 v0 = this.a;
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void a ( ) {
	 } // .end method
	 public void a ( Long p0 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 final String v1 = "vibrator"; // const-string v1, "vibrator"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/os/Vibrator; */
		 (( android.os.Vibrator ) v0 ).vibrate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 1 */
		 v0 = net.chobin.android.psdxylz.app.k.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = net.chobin.android.psdxylz.app.k.a;
			 v0 = 			 (( java.lang.Thread ) v0 ).isInterrupted ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public abstract void b ( ) {
} // .end method
public void c ( ) {
	 /* .locals 3 */
	 v0 = this.a;
	 final String v1 = "window"; // const-string v1, "window"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/WindowManager; */
	 /* new-instance v1, Landroid/util/DisplayMetrics; */
	 /* invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V */
	 (( android.view.Display ) v0 ).getMetrics ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
	 /* iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I */
	 /* int-to-float v0, v0 */
	 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->c:F */
	 /* iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I */
	 /* int-to-float v0, v0 */
	 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
	 v0 = net.chobin.android.psdxylz.app.a.a;
	 /* iget-boolean v0, v0, Lnet/chobin/android/psdxylz/app/ap;->a:Z */
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 (( net.chobin.android.psdxylz.app.k ) p0 ).getWindowVisibleDisplayFrame ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/k;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
	 /* iget v1, v0, Landroid/graphics/Rect;->top:I */
	 /* if-nez v1, :cond_2 */
	 /* iget v1, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v1, v1 */
	 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
	 /* cmpg-float v1, v1, v2 */
	 /* if-gez v1, :cond_2 */
	 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
	 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
	 /* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v0, v0 */
	 /* sub-float v0, v2, v0 */
	 /* sub-float v0, v1, v0 */
	 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
} // :cond_0
} // :goto_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/k;->c:F */
/* float-to-int v1, v1 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
/* float-to-int v2, v2 */
} // :cond_1
return;
} // :cond_2
/* iget v1, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
/* iget v0, v0, Landroid/graphics/Rect;->top:I */
/* int-to-float v0, v0 */
/* sub-float v0, v1, v0 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/k;->d:F */
} // .end method
public void d ( ) {
/* .locals 1 */
v0 = this.a;
/* check-cast v0, Lnet/chobin/android/psdxylz/app/a; */
(( net.chobin.android.psdxylz.app.a ) v0 ).finish ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->finish()V
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
v0 = this.a;
(( net.chobin.android.psdxylz.app.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lnet/chobin/android/psdxylz/app/f;->a(I)V
v0 = /* invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
v0 = this.a;
(( net.chobin.android.psdxylz.app.f ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lnet/chobin/android/psdxylz/app/f;->b(I)V
v0 = /* invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyUp(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = this.a;
(( net.chobin.android.psdxylz.app.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lnet/chobin/android/psdxylz/app/f;->a(Landroid/view/MotionEvent;)Z
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void run ( ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
/* if-nez v0, :cond_2 */
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
v0 = (( net.chobin.android.psdxylz.app.g ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/g;->a()Z
/* if-nez v0, :cond_4 */
} // :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.g ) v0 ).c ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/g;->c()V
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
v0 = this.a;
/* check-cast v0, Lnet/chobin/android/psdxylz/app/a; */
(( net.chobin.android.psdxylz.app.a ) v0 ).finish ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->finish()V
} // :cond_2
} // :goto_0
/* if-ne v0, v4, :cond_3 */
(( net.chobin.android.psdxylz.app.k ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/k;->a()V
(( net.chobin.android.psdxylz.app.k ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/k;->b()V
} // :cond_3
net.chobin.android.psdxylz.app.k.a = (v4!= 0);
return;
} // :cond_4
try { // :try_start_0
v0 = net.chobin.android.psdxylz.app.a.a;
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x38 */
(( net.chobin.android.psdxylz.app.al ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lnet/chobin/android/psdxylz/app/al;->a(III)V
/* :try_end_0 */
/* .catch Lnet/chobin/android/psdxylz/app/ah; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
} // :goto_0
/* sget-boolean v0, Lnet/chobin/android/psdxylz/app/k;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.k.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
net.chobin.android.psdxylz.app.k.a = (v0!= 0);
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
v0 = net.chobin.android.psdxylz.app.k.a;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
return;
} // :cond_0
/* const-wide/16 v0, 0x1f4 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
