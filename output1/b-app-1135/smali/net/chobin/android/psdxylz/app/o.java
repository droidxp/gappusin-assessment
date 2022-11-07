public class net.chobin.android.psdxylz.app.o {
	 /* # static fields */
	 public static final Integer a;
	 private static android.graphics.Matrix a;
	 private static android.graphics.Rect a;
	 private static android.view.SurfaceHolder a;
	 public static net.chobin.android.psdxylz.app.o a;
	 public static net.chobin.android.psdxylz.app.p a;
	 private static a;
	 public static final Integer b;
	 private static android.graphics.Paint b;
	 private static android.graphics.Rect b;
	 public static final Integer c;
	 public static android.graphics.Canvas c;
	 /* # instance fields */
	 public Float a;
	 private android.graphics.Bitmap a;
	 public android.graphics.Canvas a;
	 public android.graphics.Paint a;
	 public net.chobin.android.psdxylz.app.n a;
	 public Float b;
	 public android.graphics.Canvas b;
	 private Integer d;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.o ( ) {
		 /* .locals 3 */
		 /* const/16 v2, 0xff */
		 /* const/16 v1, 0x80 */
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 android.graphics.Color .rgb ( v0,v0,v0 );
		 v0 = 		 android.graphics.Color .rgb ( v2,v2,v2 );
		 v0 = 		 android.graphics.Color .rgb ( v1,v1,v1 );
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 /* new-instance v0, Landroid/graphics/Matrix; */
		 /* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
		 /* const/16 v0, 0x9 */
		 /* new-array v0, v0, [F */
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.o ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.b = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 this.a = p3;
		 /* iput p4, p0, Lnet/chobin/android/psdxylz/app/o;->a:F */
		 /* iput p5, p0, Lnet/chobin/android/psdxylz/app/o;->b:F */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 if ( p2 != null) { // if-eqz p2, :cond_1
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 /* if-eq p2, v0, :cond_1 */
			 } // :cond_0
			 (( net.chobin.android.psdxylz.app.o ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/o;->a()V
		 } // :cond_1
		 if ( p2 != null) { // if-eqz p2, :cond_2
		 } // :cond_2
		 /* const/high16 v0, 0x72000000 */
		 net.chobin.android.psdxylz.app.n .a ( v0 );
		 this.a = v0;
		 v0 = this.a;
		 /* const/high16 v1, 0x41400000 # 12.0f */
		 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/o;->a:F */
		 /* mul-float/2addr v1, v2 */
		 (( net.chobin.android.psdxylz.app.n ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/n;->a(F)V
		 v0 = this.a;
		 v0 = this.a;
		 this.a = v0;
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 0 */
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 v0 = 		 android.graphics.Color .rgb ( p0,p1,p2 );
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 v0 = 		 android.graphics.Color .argb ( p3,p0,p1,p2 );
	 } // .end method
	 public static void a ( android.graphics.Canvas p0, android.graphics.Bitmap p1, Integer p2, Integer p3 ) {
		 /* .locals 10 */
		 int v6 = 0; // const/4 v6, 0x0
		 v4 = 		 (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
		 v5 = 		 (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
		 v8 = 		 (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
		 v9 = 		 (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v7, v6 */
		 /* invoke-static/range {v0 ..v9}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIII)V */
		 return;
	 } // .end method
	 public static void a ( android.graphics.Canvas p0, android.graphics.Bitmap p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
		 /* .locals 7 */
		 /* const/high16 v6, 0x40000000 # 2.0f */
		 /* const/16 v1, 0xff */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 v1 = 		 android.graphics.Color .argb ( p5,v1,v1,v1 );
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* const/high16 v1, 0x42b40000 # 90.0f */
		 /* int-to-float v2, p4 */
		 /* mul-float/2addr v1, v2 */
		 /* const/high16 v2, 0x43a00000 # 320.0f */
		 /* div-float/2addr v1, v2 */
		 v2 = 		 (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* int-to-float v2, v2 */
		 v3 = 		 (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 (( android.graphics.Matrix ) v0 ).setRotate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->setRotate(FFF)V
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 v1 = net.chobin.android.psdxylz.app.o.a;
		 (( android.graphics.Matrix ) v0 ).getValues ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 int v1 = 2; // const/4 v1, 0x2
		 /* int-to-float v2, p2 */
		 v3 = 		 (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 v4 = net.chobin.android.psdxylz.app.o.a;
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget v4, v4, v5 */
		 /* mul-float/2addr v3, v4 */
		 /* div-float/2addr v3, v6 */
		 /* sub-float/2addr v2, v3 */
		 /* aput v2, v0, v1 */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 int v1 = 5; // const/4 v1, 0x5
		 /* int-to-float v2, p3 */
		 v3 = 		 (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 v4 = net.chobin.android.psdxylz.app.o.a;
		 int v5 = 3; // const/4 v5, 0x3
		 /* aget v4, v4, v5 */
		 /* mul-float/2addr v3, v4 */
		 /* div-float/2addr v3, v6 */
		 /* sub-float/2addr v2, v3 */
		 /* aput v2, v0, v1 */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 v1 = net.chobin.android.psdxylz.app.o.a;
		 (( android.graphics.Matrix ) v0 ).setValues ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setValues([F)V
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 v1 = net.chobin.android.psdxylz.app.o.b;
		 (( android.graphics.Canvas ) p0 ).drawBitmap ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public static void a ( android.graphics.Canvas p0, android.graphics.Bitmap p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
		 /* .locals 11 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move/from16 v4, p6 */
		 /* move/from16 v5, p7 */
		 /* move v6, p4 */
		 /* move/from16 v7, p5 */
		 /* move/from16 v8, p6 */
		 /* move/from16 v9, p7 */
		 /* move/from16 v10, p8 */
		 /* invoke-static/range {v0 ..v10}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIIII)V */
		 return;
	 } // .end method
	 public static void a ( android.graphics.Canvas p0, android.graphics.Bitmap p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9 ) {
		 /* .locals 3 */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* iput p6, v0, Landroid/graphics/Rect;->left:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* iput p7, v0, Landroid/graphics/Rect;->top:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* add-int v1, p6, p8 */
		 /* iput v1, v0, Landroid/graphics/Rect;->right:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* add-int v1, p7, p9 */
		 /* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* iput p2, v0, Landroid/graphics/Rect;->left:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* iput p3, v0, Landroid/graphics/Rect;->top:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* add-int v1, p2, p4 */
		 /* iput v1, v0, Landroid/graphics/Rect;->right:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* add-int v1, p3, p5 */
		 /* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 v1 = net.chobin.android.psdxylz.app.o.b;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.graphics.Canvas ) p0 ).drawBitmap ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public static void a ( android.graphics.Canvas p0, android.graphics.Bitmap p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0xff */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* iput p6, v0, Landroid/graphics/Rect;->left:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* iput p7, v0, Landroid/graphics/Rect;->top:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* add-int v1, p6, p8 */
		 /* iput v1, v0, Landroid/graphics/Rect;->right:I */
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 /* add-int v1, p7, p9 */
		 /* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* iput p2, v0, Landroid/graphics/Rect;->left:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* iput p3, v0, Landroid/graphics/Rect;->top:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* add-int v1, p2, p4 */
		 /* iput v1, v0, Landroid/graphics/Rect;->right:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* add-int v1, p3, p5 */
		 /* iput v1, v0, Landroid/graphics/Rect;->bottom:I */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 v1 = 		 android.graphics.Color .argb ( p10,v2,v2,v2 );
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 v1 = net.chobin.android.psdxylz.app.o.b;
		 v2 = net.chobin.android.psdxylz.app.o.b;
		 (( android.graphics.Canvas ) p0 ).drawBitmap ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public net.chobin.android.psdxylz.app.n a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 public void a ( ) {
		 /* .locals 3 */
		 (( net.chobin.android.psdxylz.app.o ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/o;->b()V
		 v0 = this.b;
		 v0 = 		 (( android.graphics.Canvas ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I
		 /* int-to-float v0, v0 */
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/o;->a:F */
		 /* mul-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
		 v1 = this.b;
		 v1 = 		 (( android.graphics.Canvas ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lnet/chobin/android/psdxylz/app/o;->b:F */
		 /* mul-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 net.chobin.android.psdxylz.app.p .a ( v0,v1 );
		 v0 = net.chobin.android.psdxylz.app.o.a;
		 (( net.chobin.android.psdxylz.app.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/p;->a()Lnet/chobin/android/psdxylz/app/o;
		 /* new-instance v0, Landroid/graphics/Canvas; */
		 v1 = net.chobin.android.psdxylz.app.o.a;
		 (( net.chobin.android.psdxylz.app.p ) v1 ).a ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
		 /* invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
		 return;
	 } // .end method
	 public void a ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/o;->d:I */
		 return;
	 } // .end method
	 public void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 6 */
		 v0 = net.chobin.android.psdxylz.app.o.b;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/o;->d:I */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.b;
		 /* int-to-float v1, p1 */
		 /* int-to-float v2, p2 */
		 /* int-to-float v3, p3 */
		 /* int-to-float v4, p4 */
		 v5 = net.chobin.android.psdxylz.app.o.b;
		 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
		 return;
	 } // .end method
	 public void a ( java.lang.String p0, Integer p1, Integer p2 ) {
		 /* .locals 4 */
		 v0 = this.a;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/o;->d:I */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.b;
		 /* int-to-float v1, p2 */
		 /* int-to-float v2, p3 */
		 v3 = this.a;
		 (( android.graphics.Canvas ) v0 ).drawText ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public void a ( Object p0, Integer p1, Integer p2 ) {
		 /* .locals 11 */
		 int v6 = 0; // const/4 v6, 0x0
		 v0 = this.b;
		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
		 v4 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).b ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->b()I
		 v5 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).c ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->c()I
		 v8 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).b ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->b()I
		 v9 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).c ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->c()I
		 v10 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()I
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v7, v6 */
		 /* invoke-static/range {v0 ..v10}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIIII)V */
		 return;
	 } // .end method
	 public void a ( Object p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 6 */
		 v0 = this.b;
		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
		 v5 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()I
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* invoke-static/range {v0 ..v5}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIII)V */
		 return;
	 } // .end method
	 public void a ( Object p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
		 /* .locals 9 */
		 v0 = this.b;
		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
		 v8 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()I
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* move/from16 v7, p7 */
		 /* invoke-static/range {v0 ..v8}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIII)V */
		 return;
	 } // .end method
	 public void a ( Object p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
		 /* .locals 11 */
		 v0 = this.b;
		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
		 v10 = 		 (( net.chobin.android.psdxylz.app.p ) p1 ).a ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/app/p;->a()I
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move/from16 v5, p5 */
		 /* move/from16 v6, p6 */
		 /* move/from16 v7, p7 */
		 /* move/from16 v8, p8 */
		 /* move/from16 v9, p9 */
		 /* invoke-static/range {v0 ..v10}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIIII)V */
		 return;
	 } // .end method
	 public void a ( Boolean p0 ) {
		 /* .locals 2 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 v1 = this.a;
				 int v0 = 0; // const/4 v0, 0x0
				 this.a = v0;
			 } // :cond_0
			 return;
		 } // .end method
		 public void b ( ) {
			 /* .locals 1 */
			 v0 = net.chobin.android.psdxylz.app.o.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 v0 = 				 (( net.chobin.android.psdxylz.app.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/p;->a()Z
				 /* if-nez v0, :cond_0 */
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 (( net.chobin.android.psdxylz.app.p ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/p;->a()V
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_0
			 return;
		 } // .end method
		 public void b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
			 /* .locals 6 */
			 v0 = net.chobin.android.psdxylz.app.o.b;
			 v1 = android.graphics.Paint$Style.FILL;
			 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
			 v0 = net.chobin.android.psdxylz.app.o.b;
			 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/o;->d:I */
			 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
			 v0 = this.b;
			 /* int-to-float v1, p1 */
			 /* int-to-float v2, p2 */
			 /* add-int v3, p1, p3 */
			 /* int-to-float v3, v3 */
			 /* add-int v4, p2, p4 */
			 /* int-to-float v4, v4 */
			 v5 = net.chobin.android.psdxylz.app.o.b;
			 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
			 return;
		 } // .end method
		 public void c ( ) {
			 /* .locals 2 */
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = net.chobin.android.psdxylz.app.o.a;
					 v1 = this.a;
				 } // :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 this.a = v0;
			 } // :cond_1
			 return;
		 } // .end method
		 public void c ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
			 /* .locals 6 */
			 v0 = net.chobin.android.psdxylz.app.o.b;
			 v1 = android.graphics.Paint$Style.STROKE;
			 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
			 v0 = net.chobin.android.psdxylz.app.o.b;
			 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/o;->d:I */
			 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
			 v0 = this.b;
			 /* int-to-float v1, p1 */
			 /* int-to-float v2, p2 */
			 /* add-int v3, p1, p3 */
			 /* int-to-float v3, v3 */
			 /* add-int v4, p2, p4 */
			 /* int-to-float v4, v4 */
			 v5 = net.chobin.android.psdxylz.app.o.b;
			 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
			 return;
		 } // .end method
		 public void d ( ) {
			 /* .locals 10 */
			 int v2 = 0; // const/4 v2, 0x0
			 v0 = net.chobin.android.psdxylz.app.o.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.a;
				 v0 = this.b;
				 v1 = this.a;
				 v3 = this.a;
				 v3 = 				 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
				 /* int-to-float v3, v3 */
				 /* iget v4, p0, Lnet/chobin/android/psdxylz/app/o;->a:F */
				 /* mul-float/2addr v3, v4 */
				 /* float-to-int v4, v3 */
				 v3 = this.a;
				 v3 = 				 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
				 /* int-to-float v3, v3 */
				 /* iget v5, p0, Lnet/chobin/android/psdxylz/app/o;->b:F */
				 /* mul-float/2addr v3, v5 */
				 /* float-to-int v5, v3 */
				 v3 = this.a;
				 v8 = 				 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
				 v3 = this.a;
				 v9 = 				 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
				 /* move v3, v2 */
				 /* move v6, v2 */
				 /* move v7, v2 */
				 /* invoke-static/range {v0 ..v9}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIII)V */
			 } // :cond_0
			 return;
		 } // .end method
		 public void e ( ) {
			 /* .locals 11 */
			 int v1 = 0; // const/4 v1, 0x0
			 int v10 = 0; // const/4 v10, 0x0
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.b;
				 v2 = android.graphics.Paint$Style.FILL;
				 (( android.graphics.Paint ) v0 ).setStyle ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
				 v0 = net.chobin.android.psdxylz.app.o.b;
				 /* const/high16 v2, -0x1000000 */
				 (( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
				 v0 = this.a;
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Canvas ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I
				 /* int-to-float v3, v2 */
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Canvas ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I
				 /* int-to-float v4, v2 */
				 v5 = net.chobin.android.psdxylz.app.o.b;
				 /* move v2, v1 */
				 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
				 v0 = this.a;
				 v1 = this.a;
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
				 /* int-to-float v2, v2 */
				 /* iget v3, p0, Lnet/chobin/android/psdxylz/app/o;->a:F */
				 /* mul-float/2addr v2, v3 */
				 /* float-to-int v4, v2 */
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
				 /* int-to-float v2, v2 */
				 /* iget v3, p0, Lnet/chobin/android/psdxylz/app/o;->b:F */
				 /* mul-float/2addr v2, v3 */
				 /* float-to-int v5, v2 */
				 v2 = this.a;
				 v8 = 				 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
				 v2 = this.a;
				 v9 = 				 (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
				 /* move v2, v10 */
				 /* move v3, v10 */
				 /* move v6, v10 */
				 /* move v7, v10 */
				 /* invoke-static/range {v0 ..v9}, Lnet/chobin/android/psdxylz/app/o;->a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;IIIIIIII)V */
			 } // :cond_0
			 return;
		 } // .end method
		 public void f ( ) {
			 /* .locals 7 */
			 int v6 = 0; // const/4 v6, 0x0
			 int v1 = 0; // const/4 v1, 0x0
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = net.chobin.android.psdxylz.app.o.b;
				 v2 = android.graphics.Paint$Style.FILL;
				 (( android.graphics.Paint ) v0 ).setStyle ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
				 v0 = net.chobin.android.psdxylz.app.o.b;
				 /* const/high16 v2, -0x1000000 */
				 (( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
				 v0 = this.a;
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Canvas ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I
				 /* int-to-float v3, v2 */
				 v2 = this.a;
				 v2 = 				 (( android.graphics.Canvas ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I
				 /* int-to-float v4, v2 */
				 v5 = net.chobin.android.psdxylz.app.o.b;
				 /* move v2, v1 */
				 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
				 v0 = this.a;
				 v1 = net.chobin.android.psdxylz.app.o.a;
				 (( net.chobin.android.psdxylz.app.p ) v1 ).a ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/p;->a()Landroid/graphics/Bitmap;
				 net.chobin.android.psdxylz.app.o .a ( v0,v1,v6,v6 );
			 } // :cond_0
			 return;
		 } // .end method
