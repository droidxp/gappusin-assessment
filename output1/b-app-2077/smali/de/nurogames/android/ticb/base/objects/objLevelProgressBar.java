public class de.nurogames.android.ticb.base.objects.objLevelProgressBar {
	 /* .source "objLevelProgressBar.java" */
	 /* # instance fields */
	 private Integer bee_icon_x;
	 private Integer bee_icon_y;
	 private Float cX;
	 private Float cY;
	 private Integer mH;
	 private Float mTimeGhost;
	 private Integer mW;
	 private Float mX;
	 private Float mY;
	 private android.graphics.Path pBox;
	 private Integer progress_sub_offset;
	 private Float timeGhost;
	 private Float x1;
	 private Float x2;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objLevelProgressBar ( ) {
		 /* .locals 8 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .prologue */
		 /* const/high16 v7, 0x41200000 # 10.0f */
		 /* const/high16 v6, 0x41600000 # 14.0f */
		 int v2 = 3; // const/4 v2, 0x3
		 /* const/high16 v5, 0x40400000 # 3.0f */
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 /* .line 40 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 23 */
		 /* new-instance v0, Landroid/graphics/Path; */
		 /* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
		 this.pBox = v0;
		 /* .line 25 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
		 /* .line 27 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mTimeGhost:F */
		 /* .line 42 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* .line 43 */
		 /* iput p2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* .line 44 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
		 /* .line 45 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* .line 48 */
		 v0 = this.pBox;
		 (( android.graphics.Path ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->reset()V
		 /* .line 51 */
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 52 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
		 /* .line 53 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* add-float/2addr v1, v5 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 (( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
		 /* .line 54 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* add-float/2addr v1, v4 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 55 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
		 /* int-to-float v2, v2 */
		 /* add-float/2addr v1, v2 */
		 /* sub-float/2addr v1, v4 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 56 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
		 /* int-to-float v2, v2 */
		 /* add-float/2addr v1, v2 */
		 /* sub-float/2addr v1, v5 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 57 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
		 /* int-to-float v2, v2 */
		 /* add-float/2addr v1, v2 */
		 /* sub-float/2addr v1, v4 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 58 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* add-float/2addr v1, v4 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 59 */
		 v0 = this.pBox;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
		 /* add-float/2addr v1, v5 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 (( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 206 */
	 } // :goto_0
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
	 /* int-to-float v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* float-to-int v0, v0 */
	 v1 = de.nurogames.android.ticb.base.core.AppResources.imgProgressBee;
	 v1 = 	 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
	 /* div-int/lit8 v1, v1, 0x2 */
	 /* sub-int/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->bee_icon_x:I */
	 /* .line 207 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
	 /* div-int/lit8 v1, v1, 0x2 */
	 /* int-to-float v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* float-to-int v0, v0 */
	 v1 = de.nurogames.android.ticb.base.core.AppResources.imgProgressBee;
	 v1 = 	 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
	 /* div-int/lit8 v1, v1, 0x2 */
	 /* sub-int/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->bee_icon_y:I */
	 /* .line 209 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
	 v1 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
	 v1 = 	 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
	 /* int-to-float v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->cX:F */
	 /* .line 210 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
	 v1 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
	 v1 = 	 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
	 /* int-to-float v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->cY:F */
	 /* .line 211 */
	 return;
	 /* .line 60 */
} // :cond_0
/* if-ne v0, v1, :cond_1 */
/* .line 61 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 62 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 63 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 64 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 65 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 66 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 67 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 68 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 69 */
} // :cond_1
/* if-ne v0, v1, :cond_2 */
/* .line 70 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 71 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 72 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 73 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 74 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 75 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 76 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 77 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 78 */
} // :cond_2
/* if-ne v0, v1, :cond_3 */
/* .line 79 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 80 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 81 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 82 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 83 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 84 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 85 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 86 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 87 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 88 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 89 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 90 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 91 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 92 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 93 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 94 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 95 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 96 */
} // :cond_4
/* if-ne v0, v1, :cond_5 */
/* .line 97 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 98 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 99 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 100 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 101 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 102 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 103 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 104 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 105 */
} // :cond_5
/* if-ne v0, v1, :cond_6 */
/* .line 106 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 107 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 108 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 109 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 110 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 111 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 112 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 113 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 114 */
} // :cond_6
/* if-ne v0, v1, :cond_7 */
/* .line 115 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 116 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 117 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 118 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 119 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 120 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 121 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 122 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 123 */
} // :cond_7
/* if-ne v0, v1, :cond_8 */
/* .line 124 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 125 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 126 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 127 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 128 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 129 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 130 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 131 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 132 */
} // :cond_8
/* if-ne v0, v1, :cond_9 */
/* .line 133 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 134 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 135 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 136 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 137 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 138 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 139 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 140 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 141 */
} // :cond_9
/* if-ne v0, v1, :cond_a */
/* .line 142 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 143 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 144 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 145 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 146 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 147 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 148 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 149 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 150 */
} // :cond_a
/* if-ne v0, v1, :cond_b */
/* .line 151 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 152 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 153 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 154 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 155 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 156 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 157 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 158 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 159 */
} // :cond_b
/* if-ne v0, v1, :cond_c */
/* .line 160 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 161 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 162 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 163 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 164 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 165 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 166 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v4 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 167 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 168 */
} // :cond_c
/* if-ne v0, v1, :cond_d */
/* .line 169 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 170 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 171 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 172 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 173 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 174 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 175 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 176 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 177 */
} // :cond_d
/* if-ne v0, v1, :cond_e */
/* .line 178 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 179 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 180 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 181 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 182 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 183 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 184 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 185 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 186 */
} // :cond_e
/* if-ne v0, v1, :cond_f */
/* .line 187 */
int v0 = 2; // const/4 v0, 0x2
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 188 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v2, 0x40000000 # 2.0f */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 189 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 190 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 191 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 192 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 193 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 194 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v2, 0x40000000 # 2.0f */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
/* .line 196 */
} // :cond_f
/* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* .line 197 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 198 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 199 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 200 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 201 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 202 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v6 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 203 */
v0 = this.pBox;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* add-float/2addr v1, v5 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mH:I */
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
(( android.graphics.Path ) v0 ).lineTo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public void animate ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 251 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v1, 0x43a50000 # 330.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x1:F */
/* .line 252 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v1, 0x43af0000 # 350.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x2:F */
/* .line 254 */
/* if-nez v0, :cond_0 */
/* .line 256 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 257 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).checkpointTime ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpointTime()I
/* mul-int/lit8 v1, v1, 0x3 */
/* int-to-float v1, v1 */
/* .line 258 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x1:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x1:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* .line 255 */
v0 = de.nurogames.android.ticb.base.core.VectorMath .map ( v0,v1,v5,v2,v3 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->timeGhost:F */
/* .line 265 */
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->timeGhost:F */
/* const/high16 v1, 0x43b90000 # 370.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mTimeGhost:F */
/* .line 266 */
return;
/* .line 261 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v0, v0, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->gameTimer:F */
/* .line 262 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
v1 = (( de.nurogames.android.ticb.base.objects.objTerrainMap ) v1 ).checkpointTime ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpointTime()I
/* mul-int/lit8 v1, v1, 0x2 */
/* int-to-float v1, v1 */
/* .line 263 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x2:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->x2:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mW:I */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* .line 260 */
v0 = de.nurogames.android.ticb.base.core.VectorMath .map ( v0,v1,v5,v2,v3 );
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->timeGhost:F */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 216 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressMain;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v6 ); // invoke-virtual {p1, v0, v1, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 219 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
/* if-nez v0, :cond_1 */
/* .line 220 */
v0 = this.pBox;
v1 = android.graphics.Region$Op.REPLACE;
(( android.graphics.Canvas ) p1 ).clipPath ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z
/* .line 226 */
} // :goto_0
v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressSub;
/* .line 227 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mTimeGhost:F */
/* .line 228 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->progress_sub_offset:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* .line 225 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v6 ); // invoke-virtual {p1, v0, v1, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 232 */
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = android.graphics.Region$Op.REPLACE;
/* move-object v0, p1 */
/* move v1, v7 */
/* move v2, v7 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
/* .line 234 */
/* sget-boolean v0, Lde/nurogames/android/ticb/base/core/_Display;->isHardwareAccelerated:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 236 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressBee;
/* .line 237 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->bee_icon_x:I */
/* int-to-float v1, v1 */
/* .line 238 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->bee_icon_y:I */
/* int-to-float v2, v2 */
/* .line 236 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v6 ); // invoke-virtual {p1, v0, v1, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 241 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgProgressHive;
/* .line 242 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v2, 0x41000000 # 8.0f */
/* sub-float/2addr v1, v2 */
/* .line 243 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* .line 241 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v6 ); // invoke-virtual {p1, v0, v1, v2, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 247 */
} // :cond_0
return;
/* .line 222 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mX:F */
/* const/high16 v1, 0x41300000 # 11.0f */
/* add-float/2addr v1, v0 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->mY:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->cX:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objLevelProgressBar;->cY:F */
v5 = android.graphics.Region$Op.REPLACE;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
} // .end method
