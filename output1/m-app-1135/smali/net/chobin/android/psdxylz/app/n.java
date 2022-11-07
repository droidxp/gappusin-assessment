public class net.chobin.android.psdxylz.app.n {
	 /* # instance fields */
	 public Float a;
	 private Integer a;
	 public android.graphics.Paint a;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.n ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/n;->a:I */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.a = v0;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 v0 = this.a;
		 v1 = android.graphics.Typeface.MONOSPACE;
		 int v2 = 0; // const/4 v2, 0x0
		 android.graphics.Typeface .create ( v1,v2 );
		 (( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* const/high16 v0, 0x41c00000 # 24.0f */
		 (( net.chobin.android.psdxylz.app.n ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/n;->a(F)V
		 return;
	 } // .end method
	 public static net.chobin.android.psdxylz.app.n a ( Integer p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/n; */
		 /* invoke-direct {v0, p0}, Lnet/chobin/android/psdxylz/app/n;-><init>(I)V */
	 } // .end method
	 /* # virtual methods */
	 public Float a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.Paint ) v0 ).ascent ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F
		 v0 = 		 java.lang.Math .abs ( v0 );
	 } // .end method
	 public Float a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.Paint ) v0 ).measureText ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
	 } // .end method
	 public Float a ( java.lang.String p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 7 */
		 v0 = this.a;
		 /* add-int v1, p2, p3 */
		 (( java.lang.String ) p1 ).subSequence ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;
		 int v2 = 0; // const/4 v2, 0x0
		 int v4 = 1; // const/4 v4, 0x1
		 /* int-to-float v5, p4 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move v3, p3 */
		 v0 = 		 /* invoke-virtual/range {v0 ..v6}, Landroid/graphics/Paint;->breakText(Ljava/lang/CharSequence;IIZF[F)I */
		 /* add-int/2addr v0, p2 */
		 /* int-to-float v0, v0 */
	 } // .end method
	 public void a ( Float p0 ) {
		 /* .locals 2 */
		 /* iput p1, p0, Lnet/chobin/android/psdxylz/app/n;->a:F */
		 v0 = this.a;
		 /* iget v1, p0, Lnet/chobin/android/psdxylz/app/n;->a:F */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 return;
	 } // .end method
	 public Float b ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.Paint ) v0 ).descent ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->descent()F
		 v0 = 		 java.lang.Math .abs ( v0 );
	 } // .end method
	 public Float c ( ) {
		 /* .locals 2 */
		 v0 = 		 (( net.chobin.android.psdxylz.app.n ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/n;->a()F
		 v1 = 		 (( net.chobin.android.psdxylz.app.n ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/n;->b()F
		 /* add-float/2addr v0, v1 */
	 } // .end method
