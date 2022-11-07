public class net.chobin.android.psdxylz.app.m {
	 /* # static fields */
	 public static final Integer aa;
	 public static final Integer ab;
	 /* # instance fields */
	 public Float a;
	 private Integer a;
	 private android.graphics.Bitmap a;
	 private android.graphics.Canvas a;
	 private android.view.SurfaceHolder a;
	 public Float b;
	 private Integer b;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.m ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0xff */
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 net.chobin.android.psdxylz.app.o .a ( v0,v0,v0 );
		 v0 = 		 net.chobin.android.psdxylz.app.o .a ( v1,v1,v1 );
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.m ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/m;->a:F */
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/m;->b:F */
		 this.a = p1;
		 /* iput p2, p0, Lnet/chobin/android/psdxylz/app/m;->a:I */
		 /* iput p3, p0, Lnet/chobin/android/psdxylz/app/m;->b:I */
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/m;->a:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/m;->b:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Y ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 v0 = 			 (( android.graphics.Bitmap ) v0 ).isRecycled ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
			 /* if-nez v0, :cond_0 */
			 v0 = this.a;
			 (( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
			 int v0 = 0; // const/4 v0, 0x0
			 this.a = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/m;->a:I */
	 } // .end method
	 public net.chobin.android.psdxylz.app.o a ( ) {
		 /* .locals 6 */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/o; */
		 v1 = this.a;
		 v2 = this.a;
		 v3 = this.a;
		 /* iget v4, p0, Lnet/chobin/android/psdxylz/app/m;->a:F */
		 /* iget v5, p0, Lnet/chobin/android/psdxylz/app/m;->b:F */
		 /* invoke-direct/range {v0 ..v5}, Lnet/chobin/android/psdxylz/app/o;-><init>(Landroid/graphics/Canvas;Landroid/view/SurfaceHolder;Landroid/graphics/Bitmap;FF)V */
	 } // .end method
	 public Integer b ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lnet/chobin/android/psdxylz/app/m;->b:I */
	 } // .end method
	 public void b ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Float p3, Float p4 ) {
		 /* .locals 2 */
		 this.a = p1;
		 /* iput p2, p0, Lnet/chobin/android/psdxylz/app/m;->a:I */
		 /* iput p3, p0, Lnet/chobin/android/psdxylz/app/m;->b:I */
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/m;->a:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/m;->b:F */
		 (( net.chobin.android.psdxylz.app.m ) p0 ).Y ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/m;->Y()V
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 v0 = android.graphics.Bitmap$Config.ARGB_8888;
		 android.graphics.Bitmap .createBitmap ( p2,p3,v0 );
		 this.a = v0;
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.graphics.Bitmap ) v0 ).eraseColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V
		 /* new-instance v0, Landroid/graphics/Canvas; */
		 v1 = this.a;
		 /* invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
		 this.a = v0;
		 return;
	 } // .end method
