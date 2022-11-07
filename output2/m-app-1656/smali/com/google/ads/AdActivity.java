public class com.google.ads.AdActivity extends android.app.Activity implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/AdActivity$StaticMethodWrapper; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String BASE_URL_PARAM;
public static final java.lang.String HTML_PARAM;
public static final java.lang.String INTENT_ACTION_PARAM;
public static final java.lang.String ORIENTATION_PARAM;
public static final java.lang.String TYPE_PARAM;
public static final java.lang.String URL_PARAM;
private static final com.google.ads.internal.a a;
private static final java.lang.Object b;
private static com.google.ads.AdActivity c;
private static com.google.ads.internal.d d;
private static com.google.ads.AdActivity e;
private static com.google.ads.AdActivity f;
private static final com.google.ads.AdActivity$StaticMethodWrapper g;
/* # instance fields */
private com.google.ads.internal.AdWebView h;
private android.view.ViewGroup i;
private Boolean j;
private Long k;
private android.widget.RelativeLayout l;
private com.google.ads.AdActivity m;
private Boolean n;
private Boolean o;
private Boolean p;
private Boolean q;
private com.google.ads.internal.AdVideoView r;
/* # direct methods */
static com.google.ads.AdActivity ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 74 */
	 v0 = com.google.ads.internal.a.a;
	 /* check-cast v0, Lcom/google/ads/internal/a; */
	 /* .line 88 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 /* .line 93 */
	 /* .line 99 */
	 /* .line 102 */
	 /* .line 105 */
	 /* .line 108 */
	 /* new-instance v0, Lcom/google/ads/AdActivity$StaticMethodWrapper; */
	 /* invoke-direct {v0}, Lcom/google/ads/AdActivity$StaticMethodWrapper;-><init>()V */
	 return;
} // .end method
public com.google.ads.AdActivity ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 49 */
	 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
	 /* .line 178 */
	 this.i = v0;
	 /* .line 196 */
	 this.m = v0;
	 return;
} // .end method
private android.widget.RelativeLayout$LayoutParams a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 472 */
	 /* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* invoke-direct {v0, p3, p4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 /* .line 474 */
	 (( android.widget.RelativeLayout$LayoutParams ) v0 ).setMargins ( p1, p2, v1, v1 ); // invoke-virtual {v0, p1, p2, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
	 /* .line 475 */
	 /* const/16 v1, 0xa */
	 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
	 /* .line 476 */
	 /* const/16 v1, 0x9 */
	 (( android.widget.RelativeLayout$LayoutParams ) v0 ).addRule ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
	 /* .line 478 */
} // .end method
static java.lang.Object a ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 49 */
	 v0 = com.google.ads.AdActivity.b;
} // .end method
private void a ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 251 */
	 com.google.ads.util.b .b ( p1 );
	 /* .line 252 */
	 (( com.google.ads.AdActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->finish()V
	 /* .line 253 */
	 return;
} // .end method
private void a ( java.lang.String p0, java.lang.Throwable p1 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 264 */
	 com.google.ads.util.b .b ( p1,p2 );
	 /* .line 265 */
	 (( com.google.ads.AdActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->finish()V
	 /* .line 266 */
	 return;
} // .end method
static com.google.ads.AdActivity b ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 49 */
	 v0 = com.google.ads.AdActivity.e;
} // .end method
static com.google.ads.internal.d b ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 49 */
} // .end method
static com.google.ads.internal.d c ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 49 */
	 v0 = com.google.ads.AdActivity.d;
} // .end method
private void d ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 807 */
	 /* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->j:Z */
	 /* if-nez v0, :cond_7 */
	 /* .line 809 */
	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 810 */
		 v0 = com.google.ads.AdActivity.a;
		 v1 = this.h;
		 (( com.google.ads.internal.a ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/a;->b(Landroid/webkit/WebView;)V
		 /* .line 811 */
		 v0 = this.h;
		 (( com.google.ads.internal.AdWebView ) v0 ).setAdActivity ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/AdWebView;->setAdActivity(Lcom/google/ads/AdActivity;)V
		 /* .line 815 */
		 v0 = this.h;
		 int v1 = 0; // const/4 v1, 0x0
		 (( com.google.ads.internal.AdWebView ) v0 ).setIsExpandedMraid ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdWebView;->setIsExpandedMraid(Z)V
		 /* .line 818 */
		 /* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->o:Z */
		 /* if-nez v0, :cond_1 */
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.i;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 820 */
				 /* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->p:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_8
					 /* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->q:Z */
					 /* if-nez v0, :cond_8 */
					 /* .line 822 */
					 final String v0 = "Disabling hardware acceleration on collapsing MRAID WebView."; // const-string v0, "Disabling hardware acceleration on collapsing MRAID WebView."
					 com.google.ads.util.b .a ( v0 );
					 /* .line 823 */
					 v0 = this.h;
					 (( com.google.ads.internal.AdWebView ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->b()V
					 /* .line 830 */
				 } // :cond_0
			 } // :goto_0
			 v0 = this.l;
			 v1 = this.h;
			 (( android.widget.RelativeLayout ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V
			 /* .line 831 */
			 v0 = this.i;
			 v1 = this.h;
			 (( android.view.ViewGroup ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
			 /* .line 836 */
		 } // :cond_1
		 v0 = this.r;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 837 */
			 v0 = this.r;
			 (( com.google.ads.internal.AdVideoView ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdVideoView;->e()V
			 /* .line 838 */
			 this.r = v2;
			 /* .line 842 */
		 } // :cond_2
		 v0 = com.google.ads.AdActivity.c;
		 /* if-ne p0, v0, :cond_3 */
		 /* .line 843 */
		 /* .line 847 */
	 } // :cond_3
	 v0 = this.m;
	 /* .line 849 */
	 v1 = com.google.ads.AdActivity.b;
	 /* monitor-enter v1 */
	 /* .line 850 */
	 try { // :try_start_0
		 v0 = com.google.ads.AdActivity.d;
		 if ( v0 != null) { // if-eqz v0, :cond_5
			 /* .line 854 */
			 /* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->o:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_5
				 v0 = this.h;
				 if ( v0 != null) { // if-eqz v0, :cond_5
					 /* .line 855 */
					 v0 = this.h;
					 v2 = com.google.ads.AdActivity.d;
					 (( com.google.ads.internal.d ) v2 ).j ( ); // invoke-virtual {v2}, Lcom/google/ads/internal/d;->j()Lcom/google/ads/internal/AdWebView;
					 /* if-ne v0, v2, :cond_4 */
					 /* .line 856 */
					 v0 = com.google.ads.AdActivity.d;
					 (( com.google.ads.internal.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->a()V
					 /* .line 858 */
				 } // :cond_4
				 v0 = this.h;
				 (( com.google.ads.internal.AdWebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->stopLoading()V
				 /* .line 863 */
			 } // :cond_5
			 v0 = com.google.ads.AdActivity.e;
			 /* if-ne p0, v0, :cond_6 */
			 /* .line 865 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 868 */
			 v0 = com.google.ads.AdActivity.d;
			 if ( v0 != null) { // if-eqz v0, :cond_9
				 /* .line 870 */
				 v0 = com.google.ads.AdActivity.d;
				 (( com.google.ads.internal.d ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->s()V
				 /* .line 873 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 879 */
			 } // :cond_6
		 } // :goto_1
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 881 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/google/ads/AdActivity;->j:Z */
		 /* .line 883 */
		 final String v0 = "AdActivity is closing."; // const-string v0, "AdActivity is closing."
		 com.google.ads.util.b .a ( v0 );
		 /* .line 885 */
	 } // :cond_7
	 return;
	 /* .line 824 */
} // :cond_8
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->p:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 826 */
	 final String v0 = "Re-enabling hardware acceleration on collapsing MRAID WebView."; // const-string v0, "Re-enabling hardware acceleration on collapsing MRAID WebView."
	 com.google.ads.util.b .a ( v0 );
	 /* .line 827 */
	 v0 = this.h;
	 (( com.google.ads.internal.AdWebView ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->c()V
	 /* .line 875 */
} // :cond_9
try { // :try_start_1
	 final String v0 = "currentAdManager is null while trying to destroy AdActivity."; // const-string v0, "currentAdManager is null while trying to destroy AdActivity."
	 com.google.ads.util.b .e ( v0 );
	 /* .line 879 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* throw v0 */
} // .end method
public static Boolean isShowing ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 312 */
	 v0 = com.google.ads.AdActivity.g;
	 v0 = 	 (( com.google.ads.AdActivity$StaticMethodWrapper ) v0 ).isShowing ( ); // invoke-virtual {v0}, Lcom/google/ads/AdActivity$StaticMethodWrapper;->isShowing()Z
} // .end method
public static void launchAdActivity ( Object p0, Object p1 ) {
	 /* .locals 1 */
	 /* .param p0, "adManager" # Lcom/google/ads/internal/d; */
	 /* .param p1, "adOpener" # Lcom/google/ads/internal/e; */
	 /* .prologue */
	 /* .line 322 */
	 v0 = com.google.ads.AdActivity.g;
	 (( com.google.ads.AdActivity$StaticMethodWrapper ) v0 ).launchAdActivity ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/google/ads/AdActivity$StaticMethodWrapper;->launchAdActivity(Lcom/google/ads/internal/d;Lcom/google/ads/internal/e;)V
	 /* .line 323 */
	 return;
} // .end method
/* # virtual methods */
protected android.view.View a ( Integer p0 ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 225 */
	 /* new-instance v0, Landroid/widget/ImageButton; */
	 (( com.google.ads.AdActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getApplicationContext()Landroid/content/Context;
	 /* invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V */
	 /* .line 226 */
	 /* const v1, 0x1080017 */
	 (( android.widget.ImageButton ) v0 ).setImageResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V
	 /* .line 227 */
	 (( android.widget.ImageButton ) v0 ).setBackgroundColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setBackgroundColor(I)V
	 /* .line 228 */
	 (( android.widget.ImageButton ) v0 ).setOnClickListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* .line 229 */
	 (( android.widget.ImageButton ) v0 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {v0, v2, v2, v2, v2}, Landroid/widget/ImageButton;->setPadding(IIII)V
	 /* .line 232 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* int-to-float v2, p1 */
	 (( com.google.ads.AdActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v3 ).getDisplayMetrics ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 v1 = 	 android.util.TypedValue .applyDimension ( v1,v2,v3 );
	 /* float-to-int v1, v1 */
	 /* .line 237 */
	 /* new-instance v2, Landroid/widget/FrameLayout; */
	 (( com.google.ads.AdActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getApplicationContext()Landroid/content/Context;
	 /* invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 238 */
	 (( android.widget.FrameLayout ) v2 ).addView ( v0, v1, v1 ); // invoke-virtual {v2, v0, v1, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V
	 /* .line 240 */
} // .end method
protected com.google.ads.internal.AdVideoView a ( android.app.Activity p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 427 */
	 /* new-instance v0, Lcom/google/ads/internal/AdVideoView; */
	 v1 = this.h;
	 /* invoke-direct {v0, p1, v1}, Lcom/google/ads/internal/AdVideoView;-><init>(Landroid/app/Activity;Lcom/google/ads/internal/AdWebView;)V */
} // .end method
protected void a ( com.google.ads.internal.AdWebView p0, Boolean p1, Integer p2, Boolean p3 ) {
	 /* .locals 8 */
	 /* .prologue */
	 /* const/16 v7, 0xb */
	 /* const/16 v6, 0xa */
	 int v5 = 1; // const/4 v5, 0x1
	 int v4 = -1; // const/4 v4, -0x1
	 int v3 = -2; // const/4 v3, -0x2
	 /* .line 678 */
	 (( com.google.ads.AdActivity ) p0 ).requestWindowFeature ( v5 ); // invoke-virtual {p0, v5}, Lcom/google/ads/AdActivity;->requestWindowFeature(I)Z
	 /* .line 679 */
	 (( com.google.ads.AdActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getWindow()Landroid/view/Window;
	 /* .line 680 */
	 /* const/16 v1, 0x400 */
	 /* const/16 v2, 0x400 */
	 (( android.view.Window ) v0 ).setFlags ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V
	 /* .line 684 */
	 /* if-lt v1, v7, :cond_0 */
	 /* .line 685 */
	 /* iget-boolean v1, p0, Lcom/google/ads/AdActivity;->p:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* .line 686 */
		 final String v1 = "Enabling hardware acceleration on the AdActivity window."; // const-string v1, "Enabling hardware acceleration on the AdActivity window."
		 com.google.ads.util.b .a ( v1 );
		 /* .line 687 */
		 com.google.ads.util.g .a ( v0 );
		 /* .line 696 */
	 } // :cond_0
} // :goto_0
(( com.google.ads.internal.AdWebView ) p1 ).getParent ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/AdWebView;->getParent()Landroid/view/ViewParent;
/* .line 697 */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 698 */
	 if ( p4 != null) { // if-eqz p4, :cond_5
		 /* .line 699 */
		 /* instance-of v1, v0, Landroid/view/ViewGroup; */
		 if ( v1 != null) { // if-eqz v1, :cond_4
			 /* .line 700 */
			 /* check-cast v0, Landroid/view/ViewGroup; */
			 this.i = v0;
			 /* .line 701 */
			 v0 = this.i;
			 (( android.view.ViewGroup ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
			 /* .line 714 */
		 } // :cond_1
		 (( com.google.ads.internal.AdWebView ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
		 if ( v0 != null) { // if-eqz v0, :cond_6
			 /* .line 716 */
			 final String v0 = "Interstitial created with an AdWebView that is already in use by another AdActivity."; // const-string v0, "Interstitial created with an AdWebView that is already in use by another AdActivity."
			 /* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
			 /* .line 753 */
		 } // :cond_2
	 } // :goto_1
	 return;
	 /* .line 689 */
} // :cond_3
final String v0 = "Disabling hardware acceleration on the AdActivity WebView."; // const-string v0, "Disabling hardware acceleration on the AdActivity WebView."
com.google.ads.util.b .a ( v0 );
/* .line 690 */
(( com.google.ads.internal.AdWebView ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/AdWebView;->b()V
/* .line 703 */
} // :cond_4
final String v0 = "MRAID banner was not a child of a ViewGroup."; // const-string v0, "MRAID banner was not a child of a ViewGroup."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 707 */
} // :cond_5
final String v0 = "Interstitial created with an AdWebView that has a parent."; // const-string v0, "Interstitial created with an AdWebView that has a parent."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 720 */
} // :cond_6
(( com.google.ads.AdActivity ) p0 ).setRequestedOrientation ( p3 ); // invoke-virtual {p0, p3}, Lcom/google/ads/AdActivity;->setRequestedOrientation(I)V
/* .line 721 */
(( com.google.ads.internal.AdWebView ) p1 ).setAdActivity ( p0 ); // invoke-virtual {p1, p0}, Lcom/google/ads/internal/AdWebView;->setAdActivity(Lcom/google/ads/AdActivity;)V
/* .line 724 */
if ( p4 != null) { // if-eqz p4, :cond_7
/* const/16 v0, 0x32 */
} // :goto_2
(( com.google.ads.AdActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdActivity;->a(I)Landroid/view/View;
/* .line 727 */
v1 = this.l;
(( android.widget.RelativeLayout ) v1 ).addView ( p1, v4, v4 ); // invoke-virtual {v1, p1, v4, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V
/* .line 730 */
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 734 */
if ( p4 != null) { // if-eqz p4, :cond_8
/* .line 735 */
(( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 736 */
(( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v7 ); // invoke-virtual {v1, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 742 */
} // :goto_3
v2 = this.l;
(( android.widget.RelativeLayout ) v2 ).addView ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 743 */
v0 = this.l;
(( android.widget.RelativeLayout ) v0 ).setKeepScreenOn ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setKeepScreenOn(Z)V
/* .line 744 */
v0 = this.l;
(( com.google.ads.AdActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdActivity;->setContentView(Landroid/view/View;)V
/* .line 747 */
v0 = this.l;
(( android.widget.RelativeLayout ) v0 ).getRootView ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getRootView()Landroid/view/View;
/* const/high16 v1, -0x1000000 */
(( android.view.View ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V
/* .line 750 */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 751 */
v0 = com.google.ads.AdActivity.a;
(( com.google.ads.internal.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/internal/a;->a(Landroid/webkit/WebView;)V
/* .line 724 */
} // :cond_7
/* const/16 v0, 0x20 */
/* .line 738 */
} // :cond_8
(( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 739 */
/* const/16 v2, 0x9 */
(( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
} // .end method
protected void a ( Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 410 */
int v0 = 0; // const/4 v0, 0x0
this.h = v0;
/* .line 411 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/google/ads/AdActivity;->k:J */
/* .line 412 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/AdActivity;->n:Z */
/* .line 415 */
v1 = com.google.ads.AdActivity.b;
/* monitor-enter v1 */
/* .line 416 */
try { // :try_start_0
v0 = com.google.ads.AdActivity.c;
/* if-nez v0, :cond_0 */
/* .line 418 */
/* .line 421 */
(( com.google.ads.internal.d ) p1 ).u ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->u()V
/* .line 423 */
} // :cond_0
/* monitor-exit v1 */
/* .line 424 */
return;
/* .line 423 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
protected void a ( java.util.HashMap p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lcom/google/ads/internal/d;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 337 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 338 */
/* new-instance v0, Landroid/content/ComponentName; */
final String v2 = "com.google.android.apps.plus"; // const-string v2, "com.google.android.apps.plus"
final String v3 = "com.google.android.apps.circles.platform.PlusOneActivity"; // const-string v3, "com.google.android.apps.circles.platform.PlusOneActivity"
/* invoke-direct {v0, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( android.content.Intent ) v1 ).setComponent ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
/* .line 340 */
final String v0 = "android.intent.category.LAUNCHER"; // const-string v0, "android.intent.category.LAUNCHER"
(( android.content.Intent ) v1 ).addCategory ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 341 */
(( com.google.ads.AdActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v0 ).getExtras ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
(( android.content.Intent ) v1 ).putExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 342 */
final String v2 = "com.google.circles.platform.intent.extra.ENTITY"; // const-string v2, "com.google.circles.platform.intent.extra.ENTITY"
final String v0 = "u"; // const-string v0, "u"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
(( android.content.Intent ) v1 ).putExtra ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 344 */
final String v0 = "com.google.circles.platform.intent.extra.ENTITY_TYPE"; // const-string v0, "com.google.circles.platform.intent.extra.ENTITY_TYPE"
v2 = com.google.ads.ag$b.a;
v2 = this.c;
(( android.content.Intent ) v1 ).putExtra ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 345 */
final String v2 = "com.google.circles.platform.intent.extra.ACTION"; // const-string v2, "com.google.circles.platform.intent.extra.ACTION"
final String v0 = "a"; // const-string v0, "a"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
(( android.content.Intent ) v1 ).putExtra ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 348 */
(( com.google.ads.AdActivity ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/ads/AdActivity;->a(Lcom/google/ads/internal/d;)V
/* .line 351 */
try { // :try_start_0
final String v0 = "Launching Google+ intent from AdActivity."; // const-string v0, "Launching Google+ intent from AdActivity."
com.google.ads.util.b .a ( v0 );
/* .line 352 */
int v0 = 0; // const/4 v0, 0x0
(( com.google.ads.AdActivity ) p0 ).startActivityForResult ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/google/ads/AdActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 357 */
} // :goto_0
return;
/* .line 353 */
/* :catch_0 */
/* move-exception v0 */
/* .line 354 */
(( android.content.ActivityNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
} // .end method
protected void b ( java.util.HashMap p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Lcom/google/ads/internal/d;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 368 */
/* if-nez p1, :cond_0 */
/* .line 369 */
final String v0 = "Could not get the paramMap in launchIntent()"; // const-string v0, "Could not get the paramMap in launchIntent()"
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 406 */
} // :goto_0
return;
/* .line 374 */
} // :cond_0
final String v0 = "u"; // const-string v0, "u"
(( java.util.HashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 375 */
/* if-nez v0, :cond_1 */
/* .line 376 */
final String v0 = "Could not get the URL parameter in launchIntent()."; // const-string v0, "Could not get the URL parameter in launchIntent()."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 381 */
} // :cond_1
final String v1 = "i"; // const-string v1, "i"
(( java.util.HashMap ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* .line 382 */
final String v2 = "m"; // const-string v2, "m"
(( java.util.HashMap ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
/* .line 387 */
android.net.Uri .parse ( v0 );
/* .line 388 */
/* if-nez v1, :cond_3 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 390 */
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 392 */
(( android.content.Intent ) v0 ).setDataAndType ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
/* .line 395 */
} // :cond_2
(( com.google.ads.AdActivity ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/ads/AdActivity;->a(Lcom/google/ads/internal/d;)V
/* .line 399 */
try { // :try_start_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Launching an intent from AdActivity: "; // const-string v2, "Launching an intent from AdActivity: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) v0 ).getAction ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " - "; // const-string v2, " - "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v1 );
/* .line 401 */
(( com.google.ads.AdActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 402 */
/* :catch_0 */
/* move-exception v0 */
/* .line 403 */
(( android.content.ActivityNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 388 */
} // :cond_3
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
} // .end method
public com.google.ads.internal.AdVideoView getAdVideoView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 273 */
v0 = this.r;
} // .end method
public com.google.ads.internal.AdWebView getOpeningAdWebView ( ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 283 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 284 */
v0 = this.m;
v0 = this.h;
/* .line 303 */
} // :goto_0
/* .line 288 */
} // :cond_0
v2 = com.google.ads.AdActivity.b;
/* monitor-enter v2 */
/* .line 289 */
try { // :try_start_0
v1 = com.google.ads.AdActivity.d;
/* if-nez v1, :cond_1 */
/* .line 290 */
final String v1 = "currentAdManager was null while trying to get the opening AdWebView."; // const-string v1, "currentAdManager was null while trying to get the opening AdWebView."
com.google.ads.util.b .e ( v1 );
/* .line 292 */
/* monitor-exit v2 */
/* .line 305 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 295 */
} // :cond_1
try { // :try_start_1
v1 = com.google.ads.AdActivity.d;
(( com.google.ads.internal.d ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->j()Lcom/google/ads/internal/AdWebView;
/* .line 296 */
v3 = this.h;
/* if-eq v1, v3, :cond_2 */
/* .line 299 */
/* monitor-exit v2 */
/* move-object v0, v1 */
/* .line 303 */
} // :cond_2
/* monitor-exit v2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // .end method
public void moveAdVideoView ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
/* .line 435 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 436 */
v0 = this.r;
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/ads/AdActivity;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams; */
(( com.google.ads.internal.AdVideoView ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/AdVideoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 437 */
v0 = this.r;
(( com.google.ads.internal.AdVideoView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdVideoView;->requestLayout()V
/* .line 439 */
} // :cond_0
return;
} // .end method
public void newAdVideoView ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 446 */
v0 = this.r;
/* if-nez v0, :cond_0 */
/* .line 449 */
(( com.google.ads.AdActivity ) p0 ).a ( p0 ); // invoke-virtual {p0, p0}, Lcom/google/ads/AdActivity;->a(Landroid/app/Activity;)Lcom/google/ads/internal/AdVideoView;
this.r = v0;
/* .line 450 */
v0 = this.l;
v1 = this.r;
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/ads/AdActivity;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams; */
(( android.widget.RelativeLayout ) v0 ).addView ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
/* .line 455 */
v1 = com.google.ads.AdActivity.b;
/* monitor-enter v1 */
/* .line 456 */
try { // :try_start_0
v0 = com.google.ads.AdActivity.d;
/* if-nez v0, :cond_1 */
/* .line 457 */
final String v0 = "currentAdManager was null while trying to get the opening AdWebView."; // const-string v0, "currentAdManager was null while trying to get the opening AdWebView."
com.google.ads.util.b .e ( v0 );
/* .line 459 */
/* monitor-exit v1 */
/* .line 465 */
} // :cond_0
} // :goto_0
return;
/* .line 461 */
} // :cond_1
v0 = com.google.ads.AdActivity.d;
(( com.google.ads.internal.d ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->k()Lcom/google/ads/internal/i;
/* .line 462 */
int v2 = 0; // const/4 v2, 0x0
(( com.google.ads.internal.i ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/i;->b(Z)V
/* .line 463 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 3 */
/* .param p1, "reqCode" # I */
/* .param p2, "resCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
/* .line 915 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
/* .line 918 */
(( com.google.ads.AdActivity ) p0 ).getOpeningAdWebView ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getOpeningAdWebView()Lcom/google/ads/internal/AdWebView;
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p3 != null) { // if-eqz p3, :cond_0
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v1 = "com.google.circles.platform.result.extra.CONFIRMATION"; // const-string v1, "com.google.circles.platform.result.extra.CONFIRMATION"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v1 = "com.google.circles.platform.result.extra.ACTION"; // const-string v1, "com.google.circles.platform.result.extra.ACTION"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 922 */
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v1 = "com.google.circles.platform.result.extra.CONFIRMATION"; // const-string v1, "com.google.circles.platform.result.extra.CONFIRMATION"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 924 */
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v2 = "com.google.circles.platform.result.extra.ACTION"; // const-string v2, "com.google.circles.platform.result.extra.ACTION"
(( android.os.Bundle ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 926 */
final String v2 = "yes"; // const-string v2, "yes"
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 927 */
final String v0 = "insert"; // const-string v0, "insert"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 929 */
(( com.google.ads.AdActivity ) p0 ).getOpeningAdWebView ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getOpeningAdWebView()Lcom/google/ads/internal/AdWebView;
int v1 = 1; // const/4 v1, 0x1
com.google.ads.ae .a ( v0,v1 );
/* .line 938 */
} // :cond_0
} // :goto_0
(( com.google.ads.AdActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->finish()V
/* .line 939 */
return;
/* .line 930 */
} // :cond_1
final String v0 = "delete"; // const-string v0, "delete"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 932 */
(( com.google.ads.AdActivity ) p0 ).getOpeningAdWebView ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getOpeningAdWebView()Lcom/google/ads/internal/AdWebView;
int v1 = 0; // const/4 v1, 0x0
com.google.ads.ae .a ( v0,v1 );
} // .end method
public void onClick ( android.view.View p0 ) {
/* .locals 0 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 489 */
(( com.google.ads.AdActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->finish()V
/* .line 490 */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 10 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v2 = 1; // const/4 v2, 0x1
/* .line 501 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 503 */
/* iput-boolean v6, p0, Lcom/google/ads/AdActivity;->j:Z */
/* .line 508 */
v3 = com.google.ads.AdActivity.b;
/* monitor-enter v3 */
/* .line 509 */
try { // :try_start_0
v0 = com.google.ads.AdActivity.d;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 510 */
v7 = com.google.ads.AdActivity.d;
/* .line 517 */
v0 = com.google.ads.AdActivity.e;
/* if-nez v0, :cond_0 */
/* .line 518 */
/* .line 521 */
(( com.google.ads.internal.d ) v7 ).t ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->t()V
/* .line 525 */
} // :cond_0
v0 = this.m;
/* if-nez v0, :cond_1 */
v0 = com.google.ads.AdActivity.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 526 */
v0 = com.google.ads.AdActivity.f;
this.m = v0;
/* .line 528 */
} // :cond_1
/* .line 531 */
(( com.google.ads.internal.d ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = (( com.google.ads.m ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.google.ads.AdActivity.e;
/* if-eq v0, p0, :cond_3 */
} // :cond_2
(( com.google.ads.internal.d ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.m;
v1 = com.google.ads.AdActivity.e;
/* if-ne v0, v1, :cond_4 */
/* .line 534 */
} // :cond_3
(( com.google.ads.internal.d ) v7 ).v ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->v()V
/* .line 538 */
} // :cond_4
v8 = (( com.google.ads.internal.d ) v7 ).p ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->p()Z
/* .line 541 */
(( com.google.ads.internal.d ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l; */
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l$a; */
/* .line 542 */
v1 = this.a;
(( com.google.ads.util.i$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* if-lt v4, v1, :cond_6 */
/* move v1, v2 */
} // :goto_0
/* iput-boolean v1, p0, Lcom/google/ads/AdActivity;->q:Z */
/* .line 544 */
v0 = this.b;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-lt v1, v0, :cond_7 */
/* move v0, v2 */
} // :goto_1
/* iput-boolean v0, p0, Lcom/google/ads/AdActivity;->p:Z */
/* .line 546 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 550 */
this.l = v5;
/* .line 553 */
/* iput-boolean v6, p0, Lcom/google/ads/AdActivity;->n:Z */
/* .line 557 */
/* iput-boolean v2, p0, Lcom/google/ads/AdActivity;->o:Z */
/* .line 560 */
this.r = v5;
/* .line 563 */
(( com.google.ads.AdActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getIntent()Landroid/content/Intent;
final String v1 = "com.google.ads.AdOpener"; // const-string v1, "com.google.ads.AdOpener"
(( android.content.Intent ) v0 ).getBundleExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
/* .line 564 */
/* if-nez v0, :cond_8 */
/* .line 565 */
final String v0 = "Could not get the Bundle used to create AdActivity."; // const-string v0, "Could not get the Bundle used to create AdActivity."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 660 */
} // :goto_2
return;
/* .line 512 */
} // :cond_5
try { // :try_start_1
final String v0 = "Could not get currentAdManager."; // const-string v0, "Could not get currentAdManager."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* .line 513 */
/* monitor-exit v3 */
/* .line 546 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_6
/* move v1, v6 */
/* .line 542 */
} // :cond_7
/* move v0, v6 */
/* .line 544 */
/* .line 568 */
} // :cond_8
/* new-instance v1, Lcom/google/ads/internal/e; */
/* invoke-direct {v1, v0}, Lcom/google/ads/internal/e;-><init>(Landroid/os/Bundle;)V */
/* .line 571 */
(( com.google.ads.internal.e ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/e;->b()Ljava/lang/String;
/* .line 572 */
(( com.google.ads.internal.e ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/e;->c()Ljava/util/HashMap;
/* .line 575 */
final String v1 = "plusone"; // const-string v1, "plusone"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 576 */
(( com.google.ads.AdActivity ) p0 ).a ( v9, v7 ); // invoke-virtual {p0, v9, v7}, Lcom/google/ads/AdActivity;->a(Ljava/util/HashMap;Lcom/google/ads/internal/d;)V
/* .line 577 */
} // :cond_9
final String v1 = "intent"; // const-string v1, "intent"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 578 */
(( com.google.ads.AdActivity ) p0 ).b ( v9, v7 ); // invoke-virtual {p0, v9, v7}, Lcom/google/ads/AdActivity;->b(Ljava/util/HashMap;Lcom/google/ads/internal/d;)V
/* .line 581 */
} // :cond_a
/* new-instance v1, Landroid/widget/RelativeLayout; */
(( com.google.ads.AdActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->getApplicationContext()Landroid/content/Context;
/* invoke-direct {v1, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
this.l = v1;
/* .line 584 */
final String v1 = "webapp"; // const-string v1, "webapp"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_12
/* .line 586 */
/* new-instance v0, Lcom/google/ads/internal/AdWebView; */
(( com.google.ads.internal.d ) v7 ).g ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
/* invoke-direct {v0, v1, v5}, Lcom/google/ads/internal/AdWebView;-><init>(Lcom/google/ads/m;Lcom/google/ads/AdSize;)V */
this.h = v0;
/* .line 590 */
v1 = com.google.ads.internal.a.c;
/* if-nez v8, :cond_c */
/* move v0, v2 */
} // :goto_3
com.google.ads.internal.i .a ( v7,v1,v2,v0 );
/* .line 592 */
(( com.google.ads.internal.i ) v0 ).d ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/i;->d(Z)V
/* .line 593 */
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 594 */
(( com.google.ads.internal.i ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/i;->a(Z)V
/* .line 596 */
} // :cond_b
v1 = this.h;
(( com.google.ads.internal.AdWebView ) v1 ).setWebViewClient ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/AdWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 599 */
final String v0 = "u"; // const-string v0, "u"
(( java.util.HashMap ) v9 ).get ( v0 ); // invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 600 */
final String v1 = "baseurl"; // const-string v1, "baseurl"
(( java.util.HashMap ) v9 ).get ( v1 ); // invoke-virtual {v9, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* .line 601 */
final String v2 = "html"; // const-string v2, "html"
(( java.util.HashMap ) v9 ).get ( v2 ); // invoke-virtual {v9, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
/* .line 603 */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 604 */
v1 = this.h;
(( com.google.ads.internal.AdWebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/AdWebView;->loadUrl(Ljava/lang/String;)V
/* .line 615 */
} // :goto_4
final String v0 = "o"; // const-string v0, "o"
(( java.util.HashMap ) v9 ).get ( v0 ); // invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 616 */
final String v1 = "p"; // const-string v1, "p"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_f
/* .line 617 */
v0 = com.google.ads.util.AdUtil .b ( );
/* .line 633 */
} // :goto_5
v1 = this.h;
(( com.google.ads.AdActivity ) p0 ).a ( v1, v6, v0, v8 ); // invoke-virtual {p0, v1, v6, v0, v8}, Lcom/google/ads/AdActivity;->a(Lcom/google/ads/internal/AdWebView;ZIZ)V
/* goto/16 :goto_2 */
} // :cond_c
/* move v0, v6 */
/* .line 590 */
/* .line 605 */
} // :cond_d
if ( v2 != null) { // if-eqz v2, :cond_e
/* .line 606 */
v0 = this.h;
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "utf-8"; // const-string v4, "utf-8"
/* invoke-virtual/range {v0 ..v5}, Lcom/google/ads/internal/AdWebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 609 */
} // :cond_e
final String v0 = "Could not get the URL or HTML parameter to show a web app."; // const-string v0, "Could not get the URL or HTML parameter to show a web app."
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* goto/16 :goto_2 */
/* .line 618 */
} // :cond_f
final String v1 = "l"; // const-string v1, "l"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 619 */
v0 = com.google.ads.util.AdUtil .a ( );
/* .line 625 */
} // :cond_10
v0 = com.google.ads.AdActivity.e;
/* if-ne p0, v0, :cond_11 */
/* .line 626 */
v0 = (( com.google.ads.internal.d ) v7 ).m ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->m()I
/* .line 628 */
} // :cond_11
int v0 = -1; // const/4 v0, -0x1
/* .line 634 */
} // :cond_12
final String v1 = "interstitial"; // const-string v1, "interstitial"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_13 */
final String v1 = "expand"; // const-string v1, "expand"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_15
/* .line 637 */
} // :cond_13
(( com.google.ads.internal.d ) v7 ).j ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->j()Lcom/google/ads/internal/AdWebView;
this.h = v1;
/* .line 638 */
v1 = (( com.google.ads.internal.d ) v7 ).m ( ); // invoke-virtual {v7}, Lcom/google/ads/internal/d;->m()I
/* .line 641 */
final String v3 = "expand"; // const-string v3, "expand"
v0 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_14
/* .line 642 */
v0 = this.h;
(( com.google.ads.internal.AdWebView ) v0 ).setIsExpandedMraid ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/ads/internal/AdWebView;->setIsExpandedMraid(Z)V
/* .line 643 */
/* iput-boolean v6, p0, Lcom/google/ads/AdActivity;->o:Z */
/* .line 646 */
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->p:Z */
if ( v0 != null) { // if-eqz v0, :cond_14
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->q:Z */
/* if-nez v0, :cond_14 */
/* .line 648 */
final String v0 = "Re-enabling hardware acceleration on expanding MRAID WebView."; // const-string v0, "Re-enabling hardware acceleration on expanding MRAID WebView."
com.google.ads.util.b .a ( v0 );
/* .line 649 */
v0 = this.h;
(( com.google.ads.internal.AdWebView ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->c()V
/* .line 654 */
} // :cond_14
v0 = this.h;
(( com.google.ads.AdActivity ) p0 ).a ( v0, v2, v1, v8 ); // invoke-virtual {p0, v0, v2, v1, v8}, Lcom/google/ads/AdActivity;->a(Lcom/google/ads/internal/AdWebView;ZIZ)V
/* goto/16 :goto_2 */
/* .line 656 */
} // :cond_15
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown AdOpener, <action: "; // const-string v2, "Unknown AdOpener, <action: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ">"; // const-string v1, ">"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/google/ads/AdActivity;->a(Ljava/lang/String;)V */
/* goto/16 :goto_2 */
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 769 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 770 */
v0 = this.l;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
/* .line 774 */
} // :cond_0
v0 = (( com.google.ads.AdActivity ) p0 ).isFinishing ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->isFinishing()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 775 */
/* invoke-direct {p0}, Lcom/google/ads/AdActivity;->d()V */
/* .line 776 */
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 777 */
v0 = this.h;
(( com.google.ads.internal.AdWebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->stopLoading()V
/* .line 778 */
v0 = this.h;
(( com.google.ads.internal.AdWebView ) v0 ).destroy ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdWebView;->destroy()V
/* .line 779 */
int v0 = 0; // const/4 v0, 0x0
this.h = v0;
/* .line 783 */
} // :cond_1
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 784 */
return;
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 794 */
v0 = (( com.google.ads.AdActivity ) p0 ).isFinishing ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->isFinishing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 795 */
/* invoke-direct {p0}, Lcom/google/ads/AdActivity;->d()V */
/* .line 798 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 799 */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 4 */
/* .param p1, "hasFocus" # Z */
/* .prologue */
/* .line 895 */
/* iget-boolean v0, p0, Lcom/google/ads/AdActivity;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 897 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/google/ads/AdActivity;->k:J */
/* sub-long/2addr v0, v2 */
/* const-wide/16 v2, 0xfa */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 898 */
final String v0 = "Launcher AdActivity got focus and is closing."; // const-string v0, "Launcher AdActivity got focus and is closing."
com.google.ads.util.b .d ( v0 );
/* .line 899 */
(( com.google.ads.AdActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/google/ads/AdActivity;->finish()V
/* .line 903 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V */
/* .line 904 */
return;
} // .end method
