public class com.doodlemobile.gamecenter.DMTabWidget extends android.widget.LinearLayout implements android.view.View$OnFocusChangeListener {
	 /* # interfaces */
	 /* # instance fields */
	 private android.content.Context a;
	 private com.doodlemobile.gamecenter.bu b;
	 private Integer c;
	 private android.graphics.drawable.Drawable d;
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.DMTabWidget ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 this.a = p1;
		 return;
	 } // .end method
	 public com.doodlemobile.gamecenter.DMTabWidget ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
		 this.a = p1;
		 (( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).setOrientation ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->setOrientation(I)V
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).setFocusable ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->setFocusable(Z)V
		 (( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).setOnFocusChangeListener ( p0 ); // invoke-virtual {p0, p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
		 return;
	 } // .end method
	 private Integer a ( ) {
		 /* .locals 2 */
		 v0 = 		 (( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->getChildCount()I
		 v1 = this.d;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* add-int/lit8 v0, v0, 0x1 */
			 /* div-int/lit8 v0, v0, 0x2 */
		 } // :cond_0
	 } // .end method
	 static com.doodlemobile.gamecenter.bu a ( com.doodlemobile.gamecenter.DMTabWidget p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.b;
	 } // .end method
	 private void c ( Integer p0 ) {
		 /* .locals 2 */
		 /* if-ltz p1, :cond_0 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a()I */
		 /* if-lt p1, v0, :cond_1 */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setSelected ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V
/* iput p1, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
int v1 = 1; // const/4 v1, 0x1
(( android.view.View ) v0 ).setSelected ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V
} // .end method
/* # virtual methods */
public final android.view.View a ( Integer p0 ) {
/* .locals 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* mul-int/lit8 v0, p1, 0x2 */
} // :goto_0
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->getChildAt(I)Landroid/view/View;
} // :cond_0
/* move v0, p1 */
} // .end method
final void a ( com.doodlemobile.gamecenter.bu p0 ) {
/* .locals 0 */
this.b = p1;
return;
} // .end method
public void addView ( android.view.View p0 ) {
/* .locals 6 */
int v5 = -1; // const/4 v5, -0x1
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* invoke-direct {v0, v3, v5, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V */
(( android.widget.LinearLayout$LayoutParams ) v0 ).setMargins ( v3, v3, v3, v3 ); // invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
(( android.view.View ) p1 ).setLayoutParams ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_0
(( android.view.View ) p1 ).setFocusable ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/View;->setFocusable(Z)V
(( android.view.View ) p1 ).setClickable ( v4 ); // invoke-virtual {p1, v4}, Landroid/view/View;->setClickable(Z)V
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a()I */
/* if-lez v0, :cond_1 */
/* new-instance v0, Landroid/widget/ImageView; */
v1 = this.a;
/* invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
/* new-instance v1, Landroid/widget/LinearLayout$LayoutParams; */
v2 = this.d;
v2 = (( android.graphics.drawable.Drawable ) v2 ).getIntrinsicWidth ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
/* invoke-direct {v1, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
(( android.widget.LinearLayout$LayoutParams ) v1 ).setMargins ( v3, v3, v3, v3 ); // invoke-virtual {v1, v3, v3, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
(( android.widget.ImageView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
v1 = this.d;
(( android.widget.ImageView ) v0 ).setBackgroundDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* invoke-super {p0, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V */
} // :cond_1
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V */
/* new-instance v0, Lcom/doodlemobile/gamecenter/ah; */
v1 = /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a()I */
/* sub-int/2addr v1, v4 */
/* invoke-direct {v0, p0, v1}, Lcom/doodlemobile/gamecenter/ah;-><init>(Lcom/doodlemobile/gamecenter/DMTabWidget;I)V */
(( android.view.View ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( android.view.View ) p1 ).setOnFocusChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
/* invoke-direct {p0, p1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->c(I)V */
/* if-eq v0, p1, :cond_0 */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
(( android.view.View ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
} // :cond_0
return;
} // .end method
public void childDrawableStateChanged ( android.view.View p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
/* if-ne p1, v0, :cond_0 */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->invalidate()V
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->childDrawableStateChanged(Landroid/view/View;)V */
return;
} // .end method
public void dispatchDraw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
return;
} // .end method
protected Integer getChildDrawingOrder ( Integer p0, Integer p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* sub-int v0, p1, v0 */
/* if-ne p2, v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
/* if-lt p2, v0, :cond_1 */
/* add-int/lit8 v0, p2, 0x1 */
} // :cond_1
/* move v0, p2 */
} // .end method
public void onFocusChange ( android.view.View p0, Boolean p1 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* if-ne p1, p0, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabWidget;->c:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
(( android.view.View ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
} // :cond_0
} // :goto_0
return;
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_0
v0 = /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a()I */
/* move v1, v3 */
} // :goto_1
/* if-ge v1, v0, :cond_0 */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
/* if-ne v2, p1, :cond_2 */
/* invoke-direct {p0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->c(I)V */
v0 = this.b;
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
protected void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V */
return;
} // .end method
public void setEnabled ( Boolean p0 ) {
/* .locals 3 */
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setEnabled(Z)V */
v0 = /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a()I */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
(( com.doodlemobile.gamecenter.DMTabWidget ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
(( android.view.View ) v2 ).setEnabled ( p1 ); // invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
