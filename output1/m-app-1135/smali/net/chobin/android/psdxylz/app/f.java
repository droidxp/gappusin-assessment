public class net.chobin.android.psdxylz.app.f {
	 /* # instance fields */
	 public Integer a;
	 public Boolean a;
	 public android.graphics.PointF a;
	 public a;
	 public Boolean b;
	 public b;
	 public Boolean c;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.f ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* new-array v0, v0, [Z */
		 this.b = v0;
		 (( net.chobin.android.psdxylz.app.f ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/f;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 4 */
		 int v2 = 5; // const/4 v2, 0x5
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v0, v2, [Landroid/graphics/PointF; */
		 this.a = v0;
		 /* new-array v0, v2, [Z */
		 this.a = v0;
		 /* move v0, v1 */
	 } // :goto_0
	 v2 = this.a;
	 /* array-length v2, v2 */
	 /* if-lt v0, v2, :cond_0 */
	 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/f;->a:Z */
	 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/f;->b:Z */
	 /* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/f;->c:Z */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/f;->a:I */
	 /* move v0, v1 */
} // :goto_1
v2 = this.b;
/* array-length v2, v2 */
/* if-lt v0, v2, :cond_1 */
return;
} // :cond_0
v2 = this.a;
/* new-instance v3, Landroid/graphics/PointF; */
/* invoke-direct {v3}, Landroid/graphics/PointF;-><init>()V */
/* aput-object v3, v2, v0 */
v2 = this.a;
/* aput-boolean v1, v2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
v2 = this.b;
/* aput-boolean v1, v2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lnet/chobin/android/psdxylz/app/f;->a:I */
return;
} // .end method
public void a ( Integer p0, Float p1, Float p2 ) {
/* .locals 1 */
v0 = this.a;
/* array-length v0, v0 */
/* if-ge p1, v0, :cond_0 */
v0 = this.a;
/* aget-object v0, v0, p1 */
/* iput p2, v0, Landroid/graphics/PointF;->x:F */
v0 = this.a;
/* aget-object v0, v0, p1 */
/* iput p3, v0, Landroid/graphics/PointF;->y:F */
} // :cond_0
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/f;->a:Z */
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/f;->a:Z */
} // .end method
public Boolean a ( android.view.MotionEvent p0 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v0 = 0; // const/4 v0, 0x0
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
v2 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
v2 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
v3 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* and-int/lit16 v1, v1, 0xff */
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* :pswitch_1 */
v0 = this.a;
/* array-length v0, v0 */
/* if-ge v2, v0, :cond_0 */
v0 = this.a;
/* aput-boolean v5, v0, v2 */
/* if-ge v2, v3, :cond_0 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
v1 = (( android.view.MotionEvent ) p1 ).getY ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F
(( net.chobin.android.psdxylz.app.f ) p0 ).a ( v2, v0, v1 ); // invoke-virtual {p0, v2, v0, v1}, Lnet/chobin/android/psdxylz/app/f;->a(IFF)V
} // :cond_1
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
v2 = this.a;
/* array-length v2, v2 */
/* if-ge v1, v2, :cond_2 */
v2 = this.a;
/* aget-boolean v2, v2, v1 */
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
v4 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
(( net.chobin.android.psdxylz.app.f ) p0 ).a ( v1, v2, v4 ); // invoke-virtual {p0, v1, v2, v4}, Lnet/chobin/android/psdxylz/app/f;->a(IFF)V
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* :pswitch_2 */
/* if-lt v0, v3, :cond_1 */
/* :pswitch_3 */
v1 = this.a;
/* array-length v1, v1 */
/* if-ge v2, v1, :cond_0 */
v1 = this.a;
/* aput-boolean v0, v1, v2 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/f;->a:I */
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/f;->b:Z */
return;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/f;->b:Z */
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/f;->c:Z */
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/f;->c:Z */
} // .end method
