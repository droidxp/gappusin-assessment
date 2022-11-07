public class com.doodlemobile.gamecenter.DMTabHost extends android.widget.FrameLayout implements android.view.ViewTreeObserver$OnTouchModeChangeListener {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.gamecenter.DMTabWidget a;
	 private android.widget.FrameLayout b;
	 private java.util.List c;
	 private Integer d;
	 private android.view.View e;
	 private android.app.LocalActivityManager f;
	 private com.doodlemobile.gamecenter.v g;
	 private android.view.View$OnKeyListener h;
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.DMTabHost ( ) {
		 /* .locals 4 */
		 int v3 = -1; // const/4 v3, -0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
		 this.c = v0;
		 /* iput v3, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
		 this.e = v2;
		 this.f = v2;
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).setFocusableInTouchMode ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->setFocusableInTouchMode(Z)V
		 /* const/high16 v0, 0x40000 */
		 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->setDescendantFocusability(I)V
		 /* iput v3, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
		 this.e = v2;
		 return;
	 } // .end method
	 static android.widget.FrameLayout a ( com.doodlemobile.gamecenter.DMTabHost p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.b;
	 } // .end method
	 /* # virtual methods */
	 public final com.doodlemobile.gamecenter.bb a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/bb; */
		 /* invoke-direct {v0, p0, p1}, Lcom/doodlemobile/gamecenter/bb;-><init>(Lcom/doodlemobile/gamecenter/DMTabHost;Ljava/lang/String;)V */
	 } // .end method
	 public final void a ( ) {
		 /* .locals 3 */
		 final String v2 = "id"; // const-string v2, "id"
		 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabHost;->getContext()Landroid/content/Context;
		 com.doodlemobile.gamecenter.cm .a ( v0 );
		 v0 = this.a;
		 final String v1 = "id"; // const-string v1, "id"
		 final String v1 = "tabs"; // const-string v1, "tabs"
		 v0 = 		 com.doodlemobile.gamecenter.cd .a ( v0,v2,v1 );
		 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Lcom/doodlemobile/gamecenter/DMTabWidget; */
		 this.a = v0;
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 final String v1 = "Your TabHost must have a TabWidget whose id attribute is \'android.R.id.tabs\'"; // const-string v1, "Your TabHost must have a TabWidget whose id attribute is \'android.R.id.tabs\'"
		 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* new-instance v0, Lcom/doodlemobile/gamecenter/a; */
	 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/a;-><init>(Lcom/doodlemobile/gamecenter/DMTabHost;)V */
	 this.h = v0;
	 v0 = this.a;
	 /* new-instance v1, Lcom/doodlemobile/gamecenter/k; */
	 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/k;-><init>(Lcom/doodlemobile/gamecenter/DMTabHost;)V */
	 (( com.doodlemobile.gamecenter.DMTabWidget ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(Lcom/doodlemobile/gamecenter/bu;)V
	 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabHost;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v0 );
	 v0 = this.a;
	 final String v1 = "id"; // const-string v1, "id"
	 final String v1 = "tabcontent"; // const-string v1, "tabcontent"
	 v0 = 	 com.doodlemobile.gamecenter.cd .a ( v0,v2,v1 );
	 (( com.doodlemobile.gamecenter.DMTabHost ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/FrameLayout; */
	 this.b = v0;
	 v0 = this.b;
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Ljava/lang/RuntimeException; */
	 final String v1 = "Your TabHost must have a FrameLayout whose id attribute is \'android.R.id.tabcontent\'"; // const-string v1, "Your TabHost must have a FrameLayout whose id attribute is \'android.R.id.tabcontent\'"
	 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 4 */
int v3 = -1; // const/4 v3, -0x1
/* if-ltz p1, :cond_0 */
v0 = v0 = this.c;
/* if-lt p1, v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
/* if-eq p1, v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
/* if-eq v0, v3, :cond_2 */
v0 = this.c;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
/* check-cast v0, Lcom/doodlemobile/gamecenter/bb; */
com.doodlemobile.gamecenter.bb .b ( v0 );
} // :cond_2
/* iput p1, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
v0 = this.c;
/* check-cast v0, Lcom/doodlemobile/gamecenter/bb; */
v1 = this.a;
/* iget v2, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/gamecenter/DMTabWidget;->b(I)V
com.doodlemobile.gamecenter.bb .b ( v0 );
this.e = v0;
v0 = this.e;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_3 */
v0 = this.b;
v1 = this.e;
/* new-instance v2, Landroid/view/ViewGroup$LayoutParams; */
/* invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
(( android.widget.FrameLayout ) v0 ).addView ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_3
v0 = this.a;
v0 = (( com.doodlemobile.gamecenter.DMTabWidget ) v0 ).hasFocus ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->hasFocus()Z
/* if-nez v0, :cond_4 */
v0 = this.e;
(( android.view.View ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
} // :cond_4
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
/* if-ltz v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
v1 = v1 = this.c;
/* if-ge v0, v1, :cond_0 */
v0 = this.c;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
} // .end method
public final void a ( com.doodlemobile.gamecenter.bb p0 ) {
/* .locals 2 */
com.doodlemobile.gamecenter.bb .a ( p1 );
/* if-nez v0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "you must specify a way to create the tab indicator."; // const-string v1, "you must specify a way to create the tab indicator."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
com.doodlemobile.gamecenter.bb .b ( p1 );
/* if-nez v0, :cond_1 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "you must specify a way to create the tab content"; // const-string v1, "you must specify a way to create the tab content"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
com.doodlemobile.gamecenter.bb .a ( p1 );
v1 = this.h;
(( android.view.View ) v0 ).setOnKeyListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
v1 = this.a;
(( com.doodlemobile.gamecenter.DMTabWidget ) v1 ).addView ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/gamecenter/DMTabWidget;->addView(Landroid/view/View;)V
v0 = this.c;
/* iget v0, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
(( com.doodlemobile.gamecenter.DMTabHost ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->a(I)V
} // :cond_2
return;
} // .end method
public final com.doodlemobile.gamecenter.DMTabWidget b ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 3 */
v0 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
/* if-nez v0, :cond_0 */
v1 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v1, :cond_0 */
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v2, 0x13 */
/* if-ne v1, v2, :cond_0 */
v1 = this.e;
v1 = (( android.view.View ) v1 ).hasFocus ( ); // invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.e;
(( android.view.View ) v1 ).findFocus ( ); // invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;
/* const/16 v2, 0x21 */
(( android.view.View ) v1 ).focusSearch ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->focusSearch(I)Landroid/view/View;
/* if-nez v1, :cond_0 */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
(( android.view.View ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
int v0 = 2; // const/4 v0, 0x2
(( com.doodlemobile.gamecenter.DMTabHost ) p0 ).playSoundEffect ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/DMTabHost;->playSoundEffect(I)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
public void dispatchWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
v0 = this.e;
(( android.view.View ) v0 ).dispatchWindowFocusChanged ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->dispatchWindowFocusChanged(Z)V
return;
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
(( com.doodlemobile.gamecenter.DMTabHost ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabHost;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.ViewTreeObserver ) v0 ).addOnTouchModeChangeListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V
} // :cond_0
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V */
(( com.doodlemobile.gamecenter.DMTabHost ) p0 ).getViewTreeObserver ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/DMTabHost;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.view.ViewTreeObserver ) v0 ).removeOnTouchModeChangeListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V
} // :cond_0
return;
} // .end method
public void onTouchModeChanged ( Boolean p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.e;
v0 = (( android.view.View ) v0 ).hasFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.e;
v0 = (( android.view.View ) v0 ).isFocused ( ); // invoke-virtual {v0}, Landroid/view/View;->isFocused()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/DMTabHost;->d:I */
(( com.doodlemobile.gamecenter.DMTabWidget ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/DMTabWidget;->a(I)Landroid/view/View;
(( android.view.View ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z
} // :cond_1
return;
} // .end method
