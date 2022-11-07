public class com.openfeint.internal.ui.NestedWindow extends android.app.Activity {
	 /* .source "NestedWindow.java" */
	 /* # instance fields */
	 private Boolean mIsVisible;
	 protected android.view.View mLogoImage;
	 protected android.webkit.WebView mWebView;
	 private final java.lang.String tag;
	 /* # direct methods */
	 public com.openfeint.internal.ui.NestedWindow ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 20 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/openfeint/internal/ui/NestedWindow;->mIsVisible:Z */
		 /* .line 21 */
		 final String v0 = "NestedWindow"; // const-string v0, "NestedWindow"
		 this.tag = v0;
		 /* .line 24 */
		 return;
	 } // .end method
	 private Boolean isBigScreen ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* const/16 v6, 0x3e8 */
		 /* const/16 v5, 0x320 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* .line 41 */
		 (( com.openfeint.internal.ui.NestedWindow ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/NestedWindow;->getWindowManager()Landroid/view/WindowManager;
		 /* .line 42 */
		 /* .local v0, "d":Landroid/view/Display; */
		 v2 = 		 (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
		 /* .line 43 */
		 /* .local v2, "width":I */
		 v1 = 		 (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
		 /* .line 45 */
		 /* .local v1, "height":I */
		 /* if-le v1, v2, :cond_1 */
		 /* if-lt v2, v5, :cond_1 */
		 /* if-lt v1, v6, :cond_1 */
		 /* .line 49 */
	 } // :cond_0
} // :goto_0
/* .line 47 */
} // :cond_1
/* if-lt v2, v6, :cond_2 */
/* if-ge v1, v5, :cond_0 */
/* .line 49 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
} // .end method
/* # virtual methods */
protected void beforeSetContentView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 53 */
v0 = /* invoke-direct {p0}, Lcom/openfeint/internal/ui/NestedWindow;->isBigScreen()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 54 */
(( com.openfeint.internal.ui.NestedWindow ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/NestedWindow;->getWindow()Landroid/view/Window;
int v1 = 1; // const/4 v1, 0x1
(( android.view.Window ) v0 ).requestFeature ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z
/* .line 56 */
} // :cond_0
return;
} // .end method
public void fade ( Boolean p0 ) {
/* .locals 5 */
/* .param p1, "toVisible" # Z */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v1, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
/* .line 71 */
v3 = this.mWebView;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 72 */
/* iget-boolean v3, p0, Lcom/openfeint/internal/ui/NestedWindow;->mIsVisible:Z */
/* if-eq v3, p1, :cond_0 */
/* .line 73 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/ui/NestedWindow;->mIsVisible:Z */
/* .line 74 */
/* new-instance v0, Landroid/view/animation/AlphaAnimation; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* move v3, v2 */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
} // :goto_1
/* invoke-direct {v0, v3, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
/* .line 76 */
/* .local v0, "anim":Landroid/view/animation/AlphaAnimation; */
if ( p1 != null) { // if-eqz p1, :cond_3
/* const-wide/16 v1, 0xc8 */
} // :goto_2
(( android.view.animation.AlphaAnimation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
/* .line 77 */
int v1 = 1; // const/4 v1, 0x1
(( android.view.animation.AlphaAnimation ) v0 ).setFillAfter ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V
/* .line 78 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).startAnimation ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->startAnimation(Landroid/view/animation/Animation;)V
/* .line 79 */
v1 = this.mWebView;
v1 = (( android.webkit.WebView ) v1 ).getVisibility ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getVisibility()I
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_0 */
/* .line 80 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).setVisibility ( v4 ); // invoke-virtual {v1, v4}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 81 */
(( com.openfeint.internal.ui.NestedWindow ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/NestedWindow;->findViewById(I)Landroid/view/View;
(( android.view.View ) v1 ).setVisibility ( v4 ); // invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V
/* .line 85 */
} // .end local v0 # "anim":Landroid/view/animation/AlphaAnimation;
} // :cond_0
return;
} // :cond_1
/* move v3, v1 */
/* .line 74 */
} // :cond_2
/* move v1, v2 */
/* .line 76 */
/* .restart local v0 # "anim":Landroid/view/animation/AlphaAnimation; */
} // :cond_3
/* const-wide/16 v1, 0x0 */
} // .end method
protected Integer layoutResource ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 61 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 62 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 31 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 32 */
com.openfeint.internal.Util .setOrientation ( p0 );
/* .line 33 */
(( com.openfeint.internal.ui.NestedWindow ) p0 ).beforeSetContentView ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/NestedWindow;->beforeSetContentView()V
/* .line 34 */
v0 = (( com.openfeint.internal.ui.NestedWindow ) p0 ).layoutResource ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/NestedWindow;->layoutResource()I
(( com.openfeint.internal.ui.NestedWindow ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/NestedWindow;->setContentView(I)V
/* .line 35 */
(( com.openfeint.internal.ui.NestedWindow ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/NestedWindow;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/webkit/WebView; */
this.mWebView = v0;
/* .line 36 */
(( com.openfeint.internal.ui.NestedWindow ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/NestedWindow;->findViewById(I)Landroid/view/View;
this.mLogoImage = v0;
/* .line 37 */
final String v0 = "NestedWindow"; // const-string v0, "NestedWindow"
final String v1 = "onCreate"; // const-string v1, "onCreate"
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 38 */
return;
} // .end method
