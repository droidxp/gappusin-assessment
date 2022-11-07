public class de.nurogames.android.ticb.base.objects.objMenuButton {
	 /* .source "objMenuButton.java" */
	 /* # static fields */
	 static final Integer FONT_SIZE;
	 /* # instance fields */
	 private java.lang.String btnText;
	 private Boolean clicked;
	 private Integer mHeight;
	 private android.graphics.Bitmap mImage;
	 private android.graphics.Paint mPaint1;
	 private android.graphics.Paint mPaint2;
	 private Integer mWidth;
	 private Integer mX;
	 private Integer mY;
	 private Integer textX;
	 private Integer textY;
	 private Boolean toggled;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objMenuButton ( ) {
		 /* .locals 4 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .param p2, "x" # I */
		 /* .param p3, "y" # I */
		 /* .param p4, "normal" # Landroid/graphics/Bitmap; */
		 /* .param p5, "pressed" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 /* const/high16 v3, 0x41600000 # 14.0f */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 29 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 10 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint1 = v0;
		 /* .line 11 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint2 = v0;
		 /* .line 22 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Landroid/graphics/Bitmap; */
		 this.mImage = v0;
		 /* .line 24 */
		 /* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->clicked:Z */
		 /* .line 25 */
		 /* iput-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->toggled:Z */
		 /* .line 32 */
		 this.btnText = p1;
		 /* .line 35 */
		 /* iput p2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
		 /* .line 36 */
		 /* iput p3, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
		 /* .line 38 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
		 /* add-int/lit8 v0, v0, 0x5 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textX:I */
		 /* .line 39 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
		 /* add-int/lit8 v0, v0, 0x14 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textY:I */
		 /* .line 42 */
		 v0 = this.mImage;
		 /* aput-object p4, v0, v2 */
		 /* .line 43 */
		 v0 = this.mImage;
		 /* aput-object p5, v0, v1 */
		 /* .line 46 */
		 v0 = this.mImage;
		 /* aget-object v0, v0, v1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mImage;
			 /* aget-object v0, v0, v1 */
			 v0 = 			 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
			 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mWidth:I */
			 /* .line 47 */
		 } // :cond_0
		 v0 = this.mImage;
		 /* aget-object v0, v0, v1 */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.mImage;
			 /* aget-object v0, v0, v1 */
			 v0 = 			 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
			 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mHeight:I */
			 /* .line 50 */
		 } // :cond_1
		 v0 = this.mPaint1;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 51 */
		 v0 = this.mPaint1;
		 (( android.graphics.Paint ) v0 ).setTextSize ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* .line 52 */
		 v0 = this.mPaint1;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 54 */
		 v0 = this.mPaint2;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 55 */
		 v0 = this.mPaint2;
		 (( android.graphics.Paint ) v0 ).setTextSize ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* .line 56 */
		 v0 = this.mPaint2;
		 /* const/high16 v1, -0x1000000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 58 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer Height ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 82 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mHeight:I */
	 } // .end method
	 public void Height ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 77 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mHeight:I */
		 return;
	 } // .end method
	 public Integer Width ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 81 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mWidth:I */
	 } // .end method
	 public void Width ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 76 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mWidth:I */
		 return;
	 } // .end method
	 public Integer X ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 79 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
	 } // .end method
	 public void X ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 74 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
		 return;
	 } // .end method
	 public Integer Y ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
	 } // .end method
	 public void Y ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 75 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
		 return;
	 } // .end method
	 public void isClicked ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Z */
		 /* .prologue */
		 /* .line 84 */
		 /* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->clicked:Z */
		 return;
	 } // .end method
	 public Boolean isClicked ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->clicked:Z */
	 } // .end method
	 public void isToggled ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Z */
		 /* .prologue */
		 /* .line 87 */
		 /* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->toggled:Z */
		 return;
	 } // .end method
	 public Boolean isToggled ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 88 */
		 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->toggled:Z */
	 } // .end method
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 4 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 62 */
		 v0 = this.mImage;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 63 */
			 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->clicked:Z */
			 /* if-nez v0, :cond_0 */
			 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->toggled:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 /* .line 64 */
			 } // :cond_0
			 v0 = this.mImage;
			 /* aget-object v0, v0, v2 */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.mImage;
				 /* aget-object v0, v0, v2 */
				 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
				 /* int-to-float v1, v1 */
				 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
				 /* int-to-float v2, v2 */
				 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
				 /* .line 65 */
			 } // :cond_1
			 v0 = this.btnText;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = this.btnText;
				 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textX:I */
				 /* int-to-float v1, v1 */
				 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textY:I */
				 /* int-to-float v2, v2 */
				 v3 = this.mPaint1;
				 (( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
				 /* .line 72 */
			 } // :cond_2
		 } // :goto_0
		 return;
		 /* .line 67 */
	 } // :cond_3
	 v0 = this.mImage;
	 /* aget-object v0, v0, v1 */
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 v0 = this.mImage;
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mX:I */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->mY:I */
		 /* int-to-float v2, v2 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 68 */
	 } // :cond_4
	 v0 = this.btnText;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = this.btnText;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textX:I */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objMenuButton;->textY:I */
		 /* int-to-float v2, v2 */
		 v3 = this.mPaint2;
		 (( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
	 } // .end method
