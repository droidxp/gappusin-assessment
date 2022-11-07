public class net.chobin.android.psdxylz.app.p {
	 /* # instance fields */
	 private Integer a;
	 private android.graphics.Bitmap a;
	 private Boolean a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.p ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/p;->a:Z */
		 /* const/16 v0, 0xff */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/p;->a:I */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.p ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/p;->a:Z */
		 /* const/16 v0, 0xff */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/p;->a:I */
		 this.a = p1;
		 return;
	 } // .end method
	 public static net.chobin.android.psdxylz.app.p a ( Integer p0, Integer p1 ) {
		 /* .locals 2 */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/p; */
		 /* invoke-direct {v0}, Lnet/chobin/android/psdxylz/app/p;-><init>()V */
		 v1 = android.graphics.Bitmap$Config.ARGB_8888;
		 android.graphics.Bitmap .createBitmap ( p0,p1,v1 );
		 this.a = v1;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/p;->a:I */
	 } // .end method
	 public android.graphics.Bitmap a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 public net.chobin.android.psdxylz.app.o a ( ) {
		 /* .locals 6 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/o; */
		 /* new-instance v1, Landroid/graphics/Canvas; */
		 v3 = this.a;
		 /* invoke-direct {v1, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
		 /* move-object v3, v2 */
		 /* move v5, v4 */
		 /* invoke-direct/range {v0 ..v5}, Lnet/chobin/android/psdxylz/app/o;-><init>(Landroid/graphics/Canvas;Landroid/view/SurfaceHolder;Landroid/graphics/Bitmap;FF)V */
	 } // .end method
	 public void a ( ) {
		 /* .locals 1 */
		 v0 = 		 (( net.chobin.android.psdxylz.app.p ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/p;->a()Z
		 /* if-nez v0, :cond_0 */
		 v0 = this.a;
		 (( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
	 } // :cond_0
	 return;
} // .end method
public void a ( Integer p0 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/p;->a:I */
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).isRecycled ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
		 /* if-nez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Integer b ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
} // .end method
public Integer c ( ) {
/* .locals 1 */
v0 = this.a;
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
} // .end method
