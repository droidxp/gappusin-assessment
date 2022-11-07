public class com.mobfox.video.sdk.AspectRatioImageView extends android.widget.ImageView {
	 /* .source "AspectRatioImageView.java" */
	 /* # instance fields */
	 private Boolean mFill;
	 private Integer mMaxH;
	 private Integer mMinW;
	 /* # direct methods */
	 public com.mobfox.video.sdk.AspectRatioImageView ( ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 16 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* .line 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
		 /* .line 12 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
		 /* .line 13 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
		 /* .line 17 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.AspectRatioImageView ( ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 20 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
		 /* .line 12 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
		 /* .line 13 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
		 /* .line 22 */
		 return;
	 } // .end method
	 public com.mobfox.video.sdk.AspectRatioImageView ( ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .param p3, "defStyle" # I */
		 /* .prologue */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 26 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
		 /* .line 12 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
		 /* .line 13 */
		 /* iput v1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static Float dip2pixel ( Integer p0, android.content.Context p1 ) {
		 /* .locals 5 */
		 /* .param p0, "dip" # I */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 191 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* .line 192 */
		 /* .local v1, "r":Landroid/content/res/Resources; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* int-to-float v3, p0 */
		 /* .line 193 */
		 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 192 */
		 v0 = 		 android.util.TypedValue .applyDimension ( v2,v3,v4 );
		 /* .line 195 */
		 /* .local v0, "px":F */
	 } // .end method
	 /* # virtual methods */
	 void ensureConstraintMetAndSet ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 5 */
		 /* .param p1, "measuredWidth" # I */
		 /* .param p2, "measuredHeight" # I */
		 /* .param p3, "drawableW" # I */
		 /* .param p4, "drawableH" # I */
		 /* .prologue */
		 /* .line 88 */
		 /* if-ge p3, p4, :cond_2 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 90 */
		 /* .local v2, "portraitImage":Z */
	 } // :goto_0
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 93 */
		 /* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
		 /* if-lez v3, :cond_0 */
		 /* .line 94 */
		 /* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
		 (( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
		 v1 = 		 com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
		 /* .line 96 */
		 /* .local v1, "minW":F */
		 /* int-to-float v3, p1 */
		 /* cmpg-float v3, v3, v1 */
		 /* if-gez v3, :cond_0 */
		 /* .line 97 */
		 /* float-to-int p1, v1 */
		 /* .line 98 */
		 /* div-int v3, p4, p3 */
		 /* mul-int p2, v3, p1 */
		 /* .line 103 */
	 } // .end local v1 # "minW":F
} // :cond_0
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
/* if-lez v3, :cond_1 */
/* .line 104 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v0 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 106 */
/* .local v0, "maxH":F */
/* int-to-float v3, p2 */
/* cmpl-float v3, v3, v0 */
/* if-lez v3, :cond_1 */
/* .line 107 */
/* float-to-int p2, v0 */
/* .line 108 */
/* mul-int v3, p2, p3 */
/* div-int p1, v3, p4 */
/* .line 134 */
} // .end local v0 # "maxH":F
} // :cond_1
} // :goto_1
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/mobfox/video/sdk/AspectRatioImageView;->setMeasuredDimension(II)V
/* .line 135 */
return;
/* .line 88 */
} // .end local v2 # "portraitImage":Z
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 114 */
/* .restart local v2 # "portraitImage":Z */
} // :cond_3
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
/* if-lez v3, :cond_4 */
/* .line 115 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v0 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 117 */
/* .restart local v0 # "maxH":F */
/* int-to-float v3, p2 */
/* cmpl-float v3, v3, v0 */
/* if-lez v3, :cond_4 */
/* .line 118 */
/* float-to-int p2, v0 */
/* .line 119 */
/* mul-int v3, p2, p3 */
/* div-int p1, v3, p4 */
/* .line 123 */
} // .end local v0 # "maxH":F
} // :cond_4
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
/* if-lez v3, :cond_1 */
/* .line 124 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v1 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 126 */
/* .restart local v1 # "minW":F */
/* int-to-float v3, p1 */
/* cmpg-float v3, v3, v1 */
/* if-gez v3, :cond_1 */
/* .line 127 */
/* float-to-int p1, v1 */
/* .line 128 */
/* div-int v3, p4, p3 */
/* mul-int p2, v3, p1 */
} // .end method
public void fillParent ( Boolean p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .param p1, "fill" # Z */
/* .param p2, "minWidthDip" # I */
/* .param p3, "maxHeightDip" # I */
/* .prologue */
/* .line 30 */
/* iput-boolean p1, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
/* .line 31 */
/* iput p3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
/* .line 32 */
/* iput p2, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
/* .line 35 */
return;
} // .end method
Integer getConstrainedHeight ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* .param p1, "measuredWidth" # I */
/* .param p2, "measuredHeight" # I */
/* .param p3, "drawableW" # I */
/* .param p4, "drawableH" # I */
/* .prologue */
/* .line 140 */
/* if-ge p3, p4, :cond_2 */
int v2 = 1; // const/4 v2, 0x1
/* .line 142 */
/* .local v2, "portraitImage":Z */
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 145 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
/* if-lez v3, :cond_0 */
/* .line 146 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v1 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 148 */
/* .local v1, "minW":F */
/* int-to-float v3, p1 */
/* cmpg-float v3, v3, v1 */
/* if-gez v3, :cond_0 */
/* .line 149 */
/* float-to-int p1, v1 */
/* .line 150 */
/* div-int v3, p4, p3 */
/* mul-int p2, v3, p1 */
/* .line 155 */
} // .end local v1 # "minW":F
} // :cond_0
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
/* if-lez v3, :cond_1 */
/* .line 156 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v0 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 158 */
/* .local v0, "maxH":F */
/* int-to-float v3, p2 */
/* cmpl-float v3, v3, v0 */
/* if-lez v3, :cond_1 */
/* .line 159 */
/* float-to-int p2, v0 */
/* .line 160 */
/* mul-int v3, p2, p3 */
/* div-int p1, v3, p4 */
/* .line 186 */
} // .end local v0 # "maxH":F
} // :cond_1
} // :goto_1
/* .line 140 */
} // .end local v2 # "portraitImage":Z
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 166 */
/* .restart local v2 # "portraitImage":Z */
} // :cond_3
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
/* if-lez v3, :cond_4 */
/* .line 167 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMaxH:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v0 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 169 */
/* .restart local v0 # "maxH":F */
/* int-to-float v3, p2 */
/* cmpl-float v3, v3, v0 */
/* if-lez v3, :cond_4 */
/* .line 170 */
/* float-to-int p2, v0 */
/* .line 171 */
/* mul-int v3, p2, p3 */
/* div-int p1, v3, p4 */
/* .line 175 */
} // .end local v0 # "maxH":F
} // :cond_4
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
/* if-lez v3, :cond_1 */
/* .line 176 */
/* iget v3, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mMinW:I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getContext()Landroid/content/Context;
v1 = com.mobfox.video.sdk.AspectRatioImageView .dip2pixel ( v3,v4 );
/* .line 178 */
/* .restart local v1 # "minW":F */
/* int-to-float v3, p1 */
/* cmpg-float v3, v3, v1 */
/* if-gez v3, :cond_1 */
/* .line 179 */
/* float-to-int p1, v1 */
/* .line 180 */
/* div-int v3, p4, p3 */
/* mul-int p2, v3, p1 */
} // .end method
protected Integer getMeasuredHeight ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "widthMeasureSpec" # I */
/* .param p2, "heightMeasureSpec" # I */
/* .prologue */
/* .line 63 */
v3 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 64 */
/* .local v3, "width":I */
v2 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 66 */
/* .local v2, "height":I */
/* iget-boolean v4, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
/* if-nez v4, :cond_1 */
/* .line 67 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V */
/* .line 68 */
int v4 = 0; // const/4 v4, 0x0
/* .line 81 */
} // :goto_0
/* .line 70 */
} // :cond_1
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
v0 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicHeight ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 71 */
/* .local v0, "drawableH":I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
v1 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicWidth ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 73 */
/* .local v1, "drawableW":I */
/* if-le v1, v0, :cond_2 */
/* .line 74 */
/* mul-int v4, v3, v0 */
/* div-int v2, v4, v1 */
/* .line 81 */
} // :goto_1
v4 = (( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getConstrainedHeight ( v3, v2, v1, v0 ); // invoke-virtual {p0, v3, v2, v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getConstrainedHeight(IIII)I
/* .line 76 */
} // :cond_2
/* move v2, v3 */
/* .line 77 */
/* mul-int v4, v2, v1 */
/* div-int v3, v4, v0 */
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "widthMeasureSpec" # I */
/* .param p2, "heightMeasureSpec" # I */
/* .prologue */
/* .line 40 */
v3 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 41 */
/* .local v3, "width":I */
v2 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 43 */
/* .local v2, "height":I */
/* iget-boolean v4, p0, Lcom/mobfox/video/sdk/AspectRatioImageView;->mFill:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
/* if-nez v4, :cond_1 */
/* .line 44 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V */
/* .line 59 */
} // :goto_0
return;
/* .line 46 */
} // :cond_1
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
v0 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicHeight ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* .line 47 */
/* .local v0, "drawableH":I */
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
v1 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicWidth ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* .line 49 */
/* .local v1, "drawableW":I */
/* if-le v1, v0, :cond_2 */
/* .line 50 */
/* mul-int v4, v3, v0 */
/* div-int v2, v4, v1 */
/* .line 57 */
} // :goto_1
(( com.mobfox.video.sdk.AspectRatioImageView ) p0 ).ensureConstraintMetAndSet ( v3, v2, v1, v0 ); // invoke-virtual {p0, v3, v2, v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->ensureConstraintMetAndSet(IIII)V
/* .line 52 */
} // :cond_2
/* move v2, v3 */
/* .line 53 */
/* mul-int v4, v2, v1 */
/* div-int v3, v4, v0 */
} // .end method
