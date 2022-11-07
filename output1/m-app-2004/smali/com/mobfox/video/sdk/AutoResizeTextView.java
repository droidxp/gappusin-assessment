public class com.mobfox.video.sdk.AutoResizeTextView extends android.widget.TextView {
	 /* .source "AutoResizeTextView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/AutoResizeTextView$OnTextResizeListener; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Float MIN_TEXT_SIZE;
private static final java.lang.String mEllipsis;
private static final android.graphics.Canvas sTextResizeCanvas;
/* # instance fields */
private Boolean mAddEllipsis;
private Float mMaxTextSize;
private Float mMinTextSize;
private Boolean mNeedsResize;
private Float mSpacingAdd;
private Float mSpacingMult;
private com.mobfox.video.sdk.AutoResizeTextView$OnTextResizeListener mTextResizeListener;
private Float mTextSize;
/* # direct methods */
static com.mobfox.video.sdk.AutoResizeTextView ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 31 */
	 /* new-instance v0, Landroid/graphics/Canvas; */
	 /* invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V */
	 /* .line 20 */
	 return;
} // .end method
public com.mobfox.video.sdk.AutoResizeTextView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 62 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, v0}, Lcom/mobfox/video/sdk/AutoResizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 63 */
	 return;
} // .end method
public com.mobfox.video.sdk.AutoResizeTextView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 /* .line 67 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Lcom/mobfox/video/sdk/AutoResizeTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 68 */
	 return;
} // .end method
public com.mobfox.video.sdk.AutoResizeTextView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .param p3, "defStyle" # I */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 72 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 40 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mNeedsResize:Z */
	 /* .line 46 */
	 /* iput v1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
	 /* .line 49 */
	 /* const/high16 v0, 0x41a00000 # 20.0f */
	 /* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
	 /* .line 52 */
	 /* const/high16 v0, 0x3f800000 # 1.0f */
	 /* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingMult:F */
	 /* .line 55 */
	 /* iput v1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingAdd:F */
	 /* .line 58 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mAddEllipsis:Z */
	 /* .line 73 */
	 v0 = 	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getTextSize ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getTextSize()F
	 /* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
	 /* .line 74 */
	 return;
} // .end method
private Integer getTextHeight ( java.lang.CharSequence p0, android.text.TextPaint p1, Integer p2, Float p3 ) {
	 /* .locals 8 */
	 /* .param p1, "source" # Ljava/lang/CharSequence; */
	 /* .param p2, "paint" # Landroid/text/TextPaint; */
	 /* .param p3, "width" # I */
	 /* .param p4, "textSize" # F */
	 /* .prologue */
	 /* .line 291 */
	 (( android.text.TextPaint ) p2 ).setTextSize ( p4 ); // invoke-virtual {p2, p4}, Landroid/text/TextPaint;->setTextSize(F)V
	 /* .line 293 */
	 /* new-instance v0, Landroid/text/StaticLayout; */
	 v4 = android.text.Layout$Alignment.ALIGN_NORMAL;
	 /* iget v5, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingMult:F */
	 /* iget v6, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingAdd:F */
	 int v7 = 1; // const/4 v7, 0x1
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move v3, p3 */
	 /* invoke-direct/range {v0 ..v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
	 /* .line 294 */
	 /* .local v0, "layout":Landroid/text/StaticLayout; */
	 v1 = com.mobfox.video.sdk.AutoResizeTextView.sTextResizeCanvas;
	 (( android.text.StaticLayout ) v0 ).draw ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
	 /* .line 295 */
	 v1 = 	 (( android.text.StaticLayout ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/text/StaticLayout;->getHeight()I
} // .end method
/* # virtual methods */
public Boolean getAddEllipsis ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 181 */
	 /* iget-boolean v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mAddEllipsis:Z */
} // .end method
public Float getMaxTextSize ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 147 */
	 /* iget v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
} // .end method
public Float getMinTextSize ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 165 */
	 /* iget v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 4 */
	 /* .param p1, "changed" # Z */
	 /* .param p2, "left" # I */
	 /* .param p3, "top" # I */
	 /* .param p4, "right" # I */
	 /* .param p5, "bottom" # I */
	 /* .prologue */
	 /* .line 197 */
	 /* if-nez p1, :cond_0 */
	 /* iget-boolean v2, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mNeedsResize:Z */
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 198 */
	 } // :cond_0
	 /* sub-int v2, p4, p2 */
	 v3 = 	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getCompoundPaddingLeft ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getCompoundPaddingLeft()I
	 /* sub-int/2addr v2, v3 */
	 v3 = 	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getCompoundPaddingRight ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getCompoundPaddingRight()I
	 /* sub-int v1, v2, v3 */
	 /* .line 199 */
	 /* .local v1, "widthLimit":I */
	 /* sub-int v2, p5, p3 */
	 v3 = 	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getCompoundPaddingBottom ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getCompoundPaddingBottom()I
	 /* sub-int/2addr v2, v3 */
	 v3 = 	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getCompoundPaddingTop ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getCompoundPaddingTop()I
	 /* sub-int v0, v2, v3 */
	 /* .line 200 */
	 /* .local v0, "heightLimit":I */
	 (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).resizeText ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->resizeText(II)V
	 /* .line 202 */
} // .end local v0 # "heightLimit":I
} // .end local v1 # "widthLimit":I
} // :cond_1
/* invoke-super/range {p0 ..p5}, Landroid/widget/TextView;->onLayout(ZIIII)V */
/* .line 203 */
return;
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .param p3, "oldw" # I */
/* .param p4, "oldh" # I */
/* .prologue */
/* .line 91 */
/* if-ne p1, p3, :cond_0 */
/* if-eq p2, p4, :cond_1 */
/* .line 92 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mNeedsResize:Z */
/* .line 94 */
} // :cond_1
return;
} // .end method
protected void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "before" # I */
/* .param p4, "after" # I */
/* .prologue */
/* .line 81 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mNeedsResize:Z */
/* .line 83 */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).resetTextSize ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->resetTextSize()V
/* .line 84 */
return;
} // .end method
public void resetTextSize ( ) {
/* .locals 2 */
/* .prologue */
/* .line 188 */
int v0 = 0; // const/4 v0, 0x0
/* iget v1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* invoke-super {p0, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V */
/* .line 189 */
/* iget v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
/* .line 190 */
return;
} // .end method
public void resizeText ( ) {
/* .locals 4 */
/* .prologue */
/* .line 210 */
v2 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getHeight()I
v3 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
v3 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getPaddingTop()I
/* sub-int v0, v2, v3 */
/* .line 211 */
/* .local v0, "heightLimit":I */
v2 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getWidth()I
v3 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getPaddingLeft()I
/* sub-int/2addr v2, v3 */
v3 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getPaddingRight()I
/* sub-int v1, v2, v3 */
/* .line 212 */
/* .local v1, "widthLimit":I */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).resizeText ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->resizeText(II)V
/* .line 213 */
return;
} // .end method
public void resizeText ( Integer p0, Integer p1 ) {
/* .locals 19 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .prologue */
/* .line 221 */
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getText()Ljava/lang/CharSequence; */
/* .line 223 */
/* .local v4, "text":Ljava/lang/CharSequence; */
v6 = if ( v4 != null) { // if-eqz v4, :cond_0
if ( v6 != null) { // if-eqz v6, :cond_0
/* if-lez p2, :cond_0 */
/* if-lez p1, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
int v7 = 0; // const/4 v7, 0x0
/* cmpl-float v6, v6, v7 */
/* if-nez v6, :cond_1 */
/* .line 286 */
} // :cond_0
} // :goto_0
return;
/* .line 228 */
} // :cond_1
/* invoke-virtual/range {p0 ..p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getPaint()Landroid/text/TextPaint; */
/* .line 231 */
/* .local v5, "textPaint":Landroid/text/TextPaint; */
v15 = (( android.text.TextPaint ) v5 ).getTextSize ( ); // invoke-virtual {v5}, Landroid/text/TextPaint;->getTextSize()F
/* .line 233 */
/* .local v15, "oldTextSize":F */
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
int v7 = 0; // const/4 v7, 0x0
/* cmpl-float v6, v6, v7 */
/* if-lez v6, :cond_5 */
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* move-object/from16 v0, p0 */
/* iget v7, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
v17 = java.lang.Math .min ( v6,v7 );
/* .line 236 */
/* .local v17, "targetTextSize":F */
} // :goto_1
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* move/from16 v2, v17 */
v18 = /* invoke-direct {v0, v4, v5, v1, v2}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getTextHeight(Ljava/lang/CharSequence;Landroid/text/TextPaint;IF)I */
/* .line 239 */
/* .local v18, "textHeight":I */
} // :goto_2
/* move/from16 v0, v18 */
/* move/from16 v1, p2 */
/* if-le v0, v1, :cond_2 */
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
/* cmpl-float v6, v17, v6 */
/* if-gtz v6, :cond_6 */
/* .line 245 */
} // :cond_2
/* move-object/from16 v0, p0 */
/* iget-boolean v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mAddEllipsis:Z */
if ( v6 != null) { // if-eqz v6, :cond_3
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
/* cmpl-float v6, v17, v6 */
/* if-nez v6, :cond_3 */
/* move/from16 v0, v18 */
/* move/from16 v1, p2 */
/* if-le v0, v1, :cond_3 */
/* .line 247 */
/* new-instance v3, Landroid/text/StaticLayout; */
v7 = android.text.Layout$Alignment.ALIGN_NORMAL;
/* move-object/from16 v0, p0 */
/* iget v8, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingMult:F */
/* move-object/from16 v0, p0 */
/* iget v9, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingAdd:F */
int v10 = 0; // const/4 v10, 0x0
/* move/from16 v6, p1 */
/* invoke-direct/range {v3 ..v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
/* .line 248 */
/* .local v3, "layout":Landroid/text/StaticLayout; */
v6 = com.mobfox.video.sdk.AutoResizeTextView.sTextResizeCanvas;
(( android.text.StaticLayout ) v3 ).draw ( v6 ); // invoke-virtual {v3, v6}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
/* .line 250 */
v6 = (( android.text.StaticLayout ) v3 ).getLineCount ( ); // invoke-virtual {v3}, Landroid/text/StaticLayout;->getLineCount()I
/* if-lez v6, :cond_3 */
/* .line 253 */
/* move/from16 v0, p2 */
v6 = (( android.text.StaticLayout ) v3 ).getLineForVertical ( v0 ); // invoke-virtual {v3, v0}, Landroid/text/StaticLayout;->getLineForVertical(I)I
/* add-int/lit8 v13, v6, -0x1 */
/* .line 255 */
/* .local v13, "lastLine":I */
/* if-gez v13, :cond_7 */
/* .line 256 */
final String v6 = ""; // const-string v6, ""
/* move-object/from16 v0, p0 */
(( com.mobfox.video.sdk.AutoResizeTextView ) v0 ).setText ( v6 ); // invoke-virtual {v0, v6}, Lcom/mobfox/video/sdk/AutoResizeTextView;->setText(Ljava/lang/CharSequence;)V
/* .line 276 */
} // .end local v3 # "layout":Landroid/text/StaticLayout;
} // .end local v13 # "lastLine":I
} // :cond_3
} // :goto_3
/* move/from16 v0, v17 */
(( android.text.TextPaint ) v5 ).setTextSize ( v0 ); // invoke-virtual {v5, v0}, Landroid/text/TextPaint;->setTextSize(F)V
/* .line 277 */
/* move-object/from16 v0, p0 */
/* iget v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingAdd:F */
/* move-object/from16 v0, p0 */
/* iget v7, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingMult:F */
/* move-object/from16 v0, p0 */
(( com.mobfox.video.sdk.AutoResizeTextView ) v0 ).setLineSpacing ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Lcom/mobfox/video/sdk/AutoResizeTextView;->setLineSpacing(FF)V
/* .line 280 */
/* move-object/from16 v0, p0 */
v6 = this.mTextResizeListener;
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 281 */
/* move-object/from16 v0, p0 */
v6 = this.mTextResizeListener;
/* move-object/from16 v0, p0 */
/* move/from16 v1, v17 */
/* .line 285 */
} // :cond_4
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p0 */
/* iput-boolean v6, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mNeedsResize:Z */
/* goto/16 :goto_0 */
/* .line 233 */
} // .end local v17 # "targetTextSize":F
} // .end local v18 # "textHeight":I
} // :cond_5
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* move/from16 v17, v0 */
/* goto/16 :goto_1 */
/* .line 240 */
/* .restart local v17 # "targetTextSize":F */
/* .restart local v18 # "textHeight":I */
} // :cond_6
/* const/high16 v6, 0x40000000 # 2.0f */
/* sub-float v6, v17, v6 */
/* move-object/from16 v0, p0 */
/* iget v7, v0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
v17 = java.lang.Math .max ( v6,v7 );
/* .line 241 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* move/from16 v2, v17 */
v18 = /* invoke-direct {v0, v4, v5, v1, v2}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getTextHeight(Ljava/lang/CharSequence;Landroid/text/TextPaint;IF)I */
/* goto/16 :goto_2 */
/* .line 260 */
/* .restart local v3 # "layout":Landroid/text/StaticLayout; */
/* .restart local v13 # "lastLine":I */
} // :cond_7
v16 = (( android.text.StaticLayout ) v3 ).getLineStart ( v13 ); // invoke-virtual {v3, v13}, Landroid/text/StaticLayout;->getLineStart(I)I
/* .line 261 */
/* .local v16, "start":I */
v12 = (( android.text.StaticLayout ) v3 ).getLineEnd ( v13 ); // invoke-virtual {v3, v13}, Landroid/text/StaticLayout;->getLineEnd(I)I
/* .line 262 */
/* .local v12, "end":I */
v14 = (( android.text.StaticLayout ) v3 ).getLineWidth ( v13 ); // invoke-virtual {v3, v13}, Landroid/text/StaticLayout;->getLineWidth(I)F
/* .line 263 */
/* .local v14, "lineWidth":F */
final String v6 = "..."; // const-string v6, "..."
v11 = (( android.text.TextPaint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F
/* .line 266 */
/* .local v11, "ellipseWidth":F */
} // :goto_4
/* move/from16 v0, p1 */
/* int-to-float v6, v0 */
/* add-float v7, v14, v11 */
/* cmpg-float v6, v6, v7 */
/* if-ltz v6, :cond_8 */
/* .line 269 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
int v7 = 0; // const/4 v7, 0x0
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v7 = "..."; // const-string v7, "..."
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move-object/from16 v0, p0 */
(( com.mobfox.video.sdk.AutoResizeTextView ) v0 ).setText ( v6 ); // invoke-virtual {v0, v6}, Lcom/mobfox/video/sdk/AutoResizeTextView;->setText(Ljava/lang/CharSequence;)V
/* goto/16 :goto_3 */
/* .line 267 */
} // :cond_8
/* add-int/lit8 v12, v12, -0x1 */
/* add-int/lit8 v6, v12, 0x1 */
/* move/from16 v0, v16 */
v14 = (( android.text.TextPaint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F
} // .end method
public void setAddEllipsis ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "addEllipsis" # Z */
/* .prologue */
/* .line 173 */
/* iput-boolean p1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mAddEllipsis:Z */
/* .line 174 */
return;
} // .end method
public void setLineSpacing ( Float p0, Float p1 ) {
/* .locals 0 */
/* .param p1, "add" # F */
/* .param p2, "mult" # F */
/* .prologue */
/* .line 127 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setLineSpacing(FF)V */
/* .line 128 */
/* iput p2, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingMult:F */
/* .line 129 */
/* iput p1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mSpacingAdd:F */
/* .line 130 */
return;
} // .end method
public void setMaxTextSize ( Float p0 ) {
/* .locals 0 */
/* .param p1, "maxTextSize" # F */
/* .prologue */
/* .line 137 */
/* iput p1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMaxTextSize:F */
/* .line 138 */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->requestLayout()V
/* .line 139 */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->invalidate()V
/* .line 140 */
return;
} // .end method
public void setMinTextSize ( Float p0 ) {
/* .locals 0 */
/* .param p1, "minTextSize" # F */
/* .prologue */
/* .line 155 */
/* iput p1, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mMinTextSize:F */
/* .line 156 */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->requestLayout()V
/* .line 157 */
(( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->invalidate()V
/* .line 158 */
return;
} // .end method
public void setOnResizeListener ( com.mobfox.video.sdk.AutoResizeTextView$OnTextResizeListener p0 ) {
/* .locals 0 */
/* .param p1, "listener" # Lcom/mobfox/video/sdk/AutoResizeTextView$OnTextResizeListener; */
/* .prologue */
/* .line 101 */
this.mTextResizeListener = p1;
/* .line 102 */
return;
} // .end method
public void setTextSize ( Float p0 ) {
/* .locals 1 */
/* .param p1, "size" # F */
/* .prologue */
/* .line 109 */
/* invoke-super {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V */
/* .line 110 */
v0 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getTextSize ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getTextSize()F
/* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* .line 111 */
return;
} // .end method
public void setTextSize ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "unit" # I */
/* .param p2, "size" # F */
/* .prologue */
/* .line 118 */
/* invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V */
/* .line 119 */
v0 = (( com.mobfox.video.sdk.AutoResizeTextView ) p0 ).getTextSize ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/AutoResizeTextView;->getTextSize()F
/* iput v0, p0, Lcom/mobfox/video/sdk/AutoResizeTextView;->mTextSize:F */
/* .line 120 */
return;
} // .end method
