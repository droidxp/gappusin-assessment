public class com.google.ads.AdView extends android.widget.RelativeLayout implements com.google.ads.Ad {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private com.google.ads.m a;
	 private com.google.ads.internal.d b;
	 /* # direct methods */
	 public com.google.ads.AdView ( ) {
		 /* .locals 3 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .param p2, "adSize" # Lcom/google/ads/AdSize; */
		 /* .param p3, "adUnitId" # Ljava/lang/String; */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 87 */
		 (( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
		 /* invoke-direct {p0, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 91 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z */
			 /* .line 92 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/AdView;->b(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z */
			 /* .line 94 */
			 /* invoke-direct {p0, p1, p2, p3}, Lcom/google/ads/AdView;->a(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Lcom/google/ads/internal/b; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 100 */
		 } // :goto_0
		 return;
		 /* .line 95 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 96 */
		 final String v1 = "Could not initialize AdView"; // const-string v1, "Could not initialize AdView"
		 (( com.google.ads.internal.b ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/b;->c(Ljava/lang/String;)Ljava/lang/String;
		 /* invoke-direct {p0, p1, v1, p2, v2}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)V */
		 /* .line 98 */
		 final String v1 = "Could not initialize AdView"; // const-string v1, "Could not initialize AdView"
		 (( com.google.ads.internal.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/b;->a(Ljava/lang/String;)V
	 } // .end method
	 public com.google.ads.AdView ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* .line 113 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 115 */
		 /* invoke-direct {p0, p1, p2}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 116 */
		 return;
	 } // .end method
	 public com.google.ads.AdView ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .param p3, "defStyle" # I */
		 /* .prologue */
		 /* .line 131 */
		 /* invoke-direct {p0, p1, p2}, Lcom/google/ads/AdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 132 */
		 return;
	 } // .end method
	 private Integer a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 196 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* int-to-float v1, p2 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 v0 = 		 android.util.TypedValue .applyDimension ( v0,v1,v2 );
		 /* float-to-int v0, v0 */
	 } // .end method
	 private java.lang.String a ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2, Boolean p3, Boolean p4 ) {
		 /* .locals 7 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/ads/internal/b; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 380 */
	 final String v0 = "http://schemas.android.com/apk/lib/com.google.ads"; // const-string v0, "http://schemas.android.com/apk/lib/com.google.ads"
	 /* .line 381 */
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 382 */
		 final String v0 = "@string/"; // const-string v0, "@string/"
		 v0 = 		 (( java.lang.String ) v1 ).startsWith ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 if ( p4 != null) { // if-eqz p4, :cond_2
				 /* .line 383 */
				 final String v0 = "@string/"; // const-string v0, "@string/"
				 v0 = 				 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
				 (( java.lang.String ) v1 ).substring ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
				 /* .line 384 */
				 (( android.content.Context ) p2 ).getPackageName ( ); // invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 /* .line 385 */
				 /* new-instance v3, Landroid/util/TypedValue; */
				 /* invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V */
				 /* .line 388 */
				 try { // :try_start_0
					 (( com.google.ads.AdView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/google/ads/AdView;->getResources()Landroid/content/res/Resources;
					 /* new-instance v5, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
					 (( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v5 = ":string/"; // const-string v5, ":string/"
					 (( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 int v2 = 1; // const/4 v2, 0x1
					 (( android.content.res.Resources ) v4 ).getValue ( v0, v3, v2 ); // invoke-virtual {v4, v0, v3, v2}, Landroid/content/res/Resources;->getValue(Ljava/lang/String;Landroid/util/TypedValue;Z)V
					 /* :try_end_0 */
					 /* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 393 */
					 v0 = this.string;
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 394 */
						 v0 = this.string;
						 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
						 /* .line 401 */
					 } // :goto_0
					 if ( p5 != null) { // if-eqz p5, :cond_1
						 /* if-nez v0, :cond_1 */
						 /* .line 402 */
						 /* new-instance v0, Lcom/google/ads/internal/b; */
						 /* new-instance v1, Ljava/lang/StringBuilder; */
						 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v2 = "Required XML attribute \""; // const-string v2, "Required XML attribute \""
						 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 final String v2 = "\" missing"; // const-string v2, "\" missing"
						 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 /* invoke-direct {v0, v1, v6}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;Z)V */
						 /* throw v0 */
						 /* .line 389 */
						 /* :catch_0 */
						 /* move-exception v0 */
						 /* .line 390 */
						 /* new-instance v2, Lcom/google/ads/internal/b; */
						 /* new-instance v3, Ljava/lang/StringBuilder; */
						 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v4 = "Could not find resource for "; // const-string v4, "Could not find resource for "
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 final String v4 = ": "; // const-string v4, ": "
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 /* invoke-direct {v2, v1, v6, v0}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;ZLjava/lang/Throwable;)V */
						 /* throw v2 */
						 /* .line 396 */
					 } // :cond_0
					 /* new-instance v0, Lcom/google/ads/internal/b; */
					 /* new-instance v1, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v2 = "Resource "; // const-string v2, "Resource "
					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v2 = " was not a string: "; // const-string v2, " was not a string: "
					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 /* invoke-direct {v0, v1, v6}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;Z)V */
					 /* throw v0 */
					 /* .line 405 */
				 } // :cond_1
			 } // :cond_2
			 /* move-object v0, v1 */
		 } // .end method
		 private void a ( android.app.Activity p0, com.google.ads.AdSize p1, java.lang.String p2 ) {
			 /* .locals 5 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Lcom/google/ads/internal/b; */
			 /* } */
		 } // .end annotation
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = -2; // const/4 v4, -0x2
		 /* .line 441 */
		 /* new-instance v1, Landroid/widget/FrameLayout; */
		 /* invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 442 */
		 (( android.widget.FrameLayout ) v1 ).setFocusable ( v3 ); // invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->setFocusable(Z)V
		 /* .line 444 */
		 com.google.ads.m .a ( p0,p3,p1,v1,p2 );
		 this.a = v0;
		 /* .line 447 */
		 /* new-instance v0, Lcom/google/ads/internal/d; */
		 v2 = this.a;
		 /* invoke-direct {v0, v2, v3}, Lcom/google/ads/internal/d;-><init>(Lcom/google/ads/m;Z)V */
		 this.b = v0;
		 /* .line 450 */
		 /* const/16 v0, 0x11 */
		 (( com.google.ads.AdView ) p0 ).setGravity ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/AdView;->setGravity(I)V
		 /* .line 453 */
		 try { // :try_start_0
			 v0 = this.b;
			 com.google.ads.internal.j .a ( p1,v0 );
			 /* .line 454 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 455 */
				 int v2 = -2; // const/4 v2, -0x2
				 int v3 = -2; // const/4 v3, -0x2
				 (( android.view.ViewGroup ) v0 ).addView ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V
				 /* .line 458 */
				 int v2 = -2; // const/4 v2, -0x2
				 int v3 = -2; // const/4 v3, -0x2
				 (( com.google.ads.AdView ) p0 ).addView ( v0, v2, v3 ); // invoke-virtual {p0, v0, v2, v3}, Lcom/google/ads/AdView;->addView(Landroid/view/View;II)V
				 /* .line 472 */
			 } // :goto_0
			 return;
			 /* .line 462 */
		 } // :cond_0
		 int v0 = -2; // const/4 v0, -0x2
		 int v2 = -2; // const/4 v2, -0x2
		 (( com.google.ads.AdView ) p0 ).addView ( v1, v0, v2 ); // invoke-virtual {p0, v1, v0, v2}, Lcom/google/ads/AdView;->addView(Landroid/view/View;II)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/VerifyError; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 466 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 467 */
		 final String v2 = "Gestures disabled: Not supported on this version of Android."; // const-string v2, "Gestures disabled: Not supported on this version of Android."
		 com.google.ads.util.b .a ( v2,v0 );
		 /* .line 468 */
		 (( com.google.ads.AdView ) p0 ).addView ( v1, v4, v4 ); // invoke-virtual {p0, v1, v4, v4}, Lcom/google/ads/AdView;->addView(Landroid/view/View;II)V
	 } // .end method
	 private void a ( android.content.Context p0, android.util.AttributeSet p1 ) {
		 /* .locals 12 */
		 /* .prologue */
		 int v7 = 0; // const/4 v7, 0x0
		 /* .line 300 */
		 /* if-nez p2, :cond_1 */
		 /* .line 375 */
	 } // :cond_0
} // :goto_0
return;
/* .line 307 */
} // :cond_1
try { // :try_start_0
final String v2 = "adSize"; // const-string v2, "adSize"
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* invoke-direct/range {v1 ..v6}, Lcom/google/ads/AdView;->a(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/lang/String; */
/* .line 309 */
final String v2 = "BANNER"; // const-string v2, "BANNER"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
	 v5 = com.google.ads.AdSize.BANNER;
	 /* :try_end_0 */
	 /* .catch Lcom/google/ads/internal/b; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .line 317 */
} // :goto_1
/* if-nez v5, :cond_8 */
/* .line 318 */
try { // :try_start_1
	 /* new-instance v2, Lcom/google/ads/internal/b; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "Attribute \"adSize\" invalid: "; // const-string v4, "Attribute \"adSize\" invalid: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 int v3 = 1; // const/4 v3, 0x1
	 /* invoke-direct {v2, v1, v3}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;Z)V */
	 /* throw v2 */
	 /* :try_end_1 */
	 /* .catch Lcom/google/ads/internal/b; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .line 366 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 367 */
} // :goto_2
final String v2 = "Could not initialize AdView"; // const-string v2, "Could not initialize AdView"
(( com.google.ads.internal.b ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/b;->c(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {p0, p1, v2, v5, p2}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)V */
/* .line 369 */
final String v2 = "Could not initialize AdView"; // const-string v2, "Could not initialize AdView"
(( com.google.ads.internal.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/b;->a(Ljava/lang/String;)V
/* .line 371 */
v2 = (( com.google.ads.AdView ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Lcom/google/ads/AdView;->isInEditMode()Z
/* if-nez v2, :cond_0 */
/* .line 372 */
final String v2 = "Could not initialize AdView"; // const-string v2, "Could not initialize AdView"
(( com.google.ads.internal.b ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/b;->b(Ljava/lang/String;)V
/* .line 309 */
} // :cond_2
try { // :try_start_2
final String v2 = "SMART_BANNER"; // const-string v2, "SMART_BANNER"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 v5 = com.google.ads.AdSize.SMART_BANNER;
} // :cond_3
final String v2 = "IAB_MRECT"; // const-string v2, "IAB_MRECT"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
	 v5 = com.google.ads.AdSize.IAB_MRECT;
} // :cond_4
final String v2 = "IAB_BANNER"; // const-string v2, "IAB_BANNER"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
	 v5 = com.google.ads.AdSize.IAB_BANNER;
} // :cond_5
final String v2 = "IAB_LEADERBOARD"; // const-string v2, "IAB_LEADERBOARD"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
	 v5 = com.google.ads.AdSize.IAB_LEADERBOARD;
} // :cond_6
final String v2 = "IAB_WIDE_SKYSCRAPER"; // const-string v2, "IAB_WIDE_SKYSCRAPER"
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
	 v5 = com.google.ads.AdSize.IAB_WIDE_SKYSCRAPER;
	 /* :try_end_2 */
	 /* .catch Lcom/google/ads/internal/b; {:try_start_2 ..:try_end_2} :catch_1 */
} // :cond_7
/* move-object v5, v7 */
/* .line 322 */
} // :cond_8
try { // :try_start_3
final String v1 = "adUnitId"; // const-string v1, "adUnitId"
v1 = /* invoke-direct {p0, v1, p2}, Lcom/google/ads/AdView;->a(Ljava/lang/String;Landroid/util/AttributeSet;)Z */
/* if-nez v1, :cond_9 */
/* .line 323 */
/* new-instance v1, Lcom/google/ads/internal/b; */
final String v2 = "Required XML attribute \"adUnitId\" missing"; // const-string v2, "Required XML attribute \"adUnitId\" missing"
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;Z)V */
/* throw v1 */
/* .line 327 */
} // :cond_9
v1 = (( com.google.ads.AdView ) p0 ).isInEditMode ( ); // invoke-virtual {p0}, Lcom/google/ads/AdView;->isInEditMode()Z
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 329 */
final String v3 = "Ads by Google"; // const-string v3, "Ads by Google"
int v4 = -1; // const/4 v4, -0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v6, p2 */
/* invoke-virtual/range {v1 ..v6}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Ljava/lang/String;ILcom/google/ads/AdSize;Landroid/util/AttributeSet;)V */
/* goto/16 :goto_0 */
/* .line 332 */
} // :cond_a
final String v7 = "adUnitId"; // const-string v7, "adUnitId"
int v10 = 1; // const/4 v10, 0x1
int v11 = 1; // const/4 v11, 0x1
/* move-object v6, p0 */
/* move-object v8, p1 */
/* move-object v9, p2 */
/* invoke-direct/range {v6 ..v11}, Lcom/google/ads/AdView;->a(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/lang/String; */
/* .line 335 */
final String v1 = "http://schemas.android.com/apk/lib/com.google.ads"; // const-string v1, "http://schemas.android.com/apk/lib/com.google.ads"
final String v3 = "loadAdOnCreate"; // const-string v3, "loadAdOnCreate"
v3 = int v4 = 0; // const/4 v4, 0x0
/* .line 339 */
/* instance-of v1, p1, Landroid/app/Activity; */
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 340 */
/* move-object v0, p1 */
/* check-cast v0, Landroid/app/Activity; */
/* move-object v1, v0 */
/* .line 343 */
/* invoke-direct {p0, v1, v5, p2}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z */
/* .line 344 */
/* invoke-direct {p0, v1, v5, p2}, Lcom/google/ads/AdView;->b(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z */
/* .line 347 */
/* invoke-direct {p0, v1, v5, v2}, Lcom/google/ads/AdView;->a(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V */
/* .line 349 */
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 350 */
	 final String v7 = "testDevices"; // const-string v7, "testDevices"
	 int v10 = 0; // const/4 v10, 0x0
	 int v11 = 0; // const/4 v11, 0x0
	 /* move-object v6, p0 */
	 /* move-object v8, p1 */
	 /* move-object v9, p2 */
	 /* invoke-direct/range {v6 ..v11}, Lcom/google/ads/AdView;->b(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/util/Set; */
	 /* .line 352 */
	 v2 = 	 final String v2 = "TEST_EMULATOR"; // const-string v2, "TEST_EMULATOR"
	 if ( v2 != null) { // if-eqz v2, :cond_b
		 /* .line 353 */
		 final String v2 = "TEST_EMULATOR"; // const-string v2, "TEST_EMULATOR"
		 /* .line 354 */
		 v2 = com.google.ads.AdRequest.TEST_EMULATOR;
		 /* .line 357 */
	 } // :cond_b
	 /* new-instance v2, Lcom/google/ads/AdRequest; */
	 /* invoke-direct {v2}, Lcom/google/ads/AdRequest;-><init>()V */
	 (( com.google.ads.AdRequest ) v2 ).setTestDevices ( v1 ); // invoke-virtual {v2, v1}, Lcom/google/ads/AdRequest;->setTestDevices(Ljava/util/Set;)Lcom/google/ads/AdRequest;
	 final String v7 = "keywords"; // const-string v7, "keywords"
	 int v10 = 0; // const/4 v10, 0x0
	 int v11 = 0; // const/4 v11, 0x0
	 /* move-object v6, p0 */
	 /* move-object v8, p1 */
	 /* move-object v9, p2 */
	 /* invoke-direct/range {v6 ..v11}, Lcom/google/ads/AdView;->b(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/util/Set; */
	 (( com.google.ads.AdRequest ) v1 ).setKeywords ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/AdRequest;->setKeywords(Ljava/util/Set;)Lcom/google/ads/AdRequest;
	 (( com.google.ads.AdView ) p0 ).loadAd ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/ads/AdView;->loadAd(Lcom/google/ads/AdRequest;)V
	 /* goto/16 :goto_0 */
	 /* .line 362 */
} // :cond_c
/* new-instance v1, Lcom/google/ads/internal/b; */
final String v2 = "AdView was initialized with a Context that wasn\'t an Activity."; // const-string v2, "AdView was initialized with a Context that wasn\'t an Activity."
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/internal/b;-><init>(Ljava/lang/String;Z)V */
/* throw v1 */
/* :try_end_3 */
/* .catch Lcom/google/ads/internal/b; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 366 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v5, v7 */
/* goto/16 :goto_2 */
} // .end method
private void a ( android.content.Context p0, java.lang.String p1, com.google.ads.AdSize p2, android.util.AttributeSet p3 ) {
/* .locals 6 */
/* .prologue */
/* .line 283 */
com.google.ads.util.b .b ( p2 );
/* .line 286 */
/* const/high16 v3, -0x10000 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/google/ads/AdView;->a(Landroid/content/Context;Ljava/lang/String;ILcom/google/ads/AdSize;Landroid/util/AttributeSet;)V */
/* .line 287 */
return;
} // .end method
private Boolean a ( android.content.Context p0, com.google.ads.AdSize p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 215 */
v0 = com.google.ads.util.AdUtil .c ( p1 );
/* if-nez v0, :cond_0 */
/* .line 216 */
/* .line 221 */
int v0 = 0; // const/4 v0, 0x0
/* .line 224 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean a ( java.lang.String p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 427 */
final String v0 = "http://schemas.android.com/apk/lib/com.google.ads"; // const-string v0, "http://schemas.android.com/apk/lib/com.google.ads"
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private java.util.Set b ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2, Boolean p3, Boolean p4 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Context;", */
/* "Landroid/util/AttributeSet;", */
/* "ZZ)", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/ads/internal/b; */
/* } */
} // .end annotation
/* .prologue */
/* .line 411 */
/* invoke-direct/range {p0 ..p5}, Lcom/google/ads/AdView;->a(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/lang/String; */
/* .line 412 */
/* new-instance v1, Ljava/util/HashSet; */
/* invoke-direct {v1}, Ljava/util/HashSet;-><init>()V */
/* .line 413 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 414 */
final String v2 = ","; // const-string v2, ","
(( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 415 */
/* array-length v3, v2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v3, :cond_1 */
/* aget-object v4, v2, v0 */
/* .line 416 */
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 417 */
v5 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 418 */
/* .line 415 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 423 */
} // :cond_1
} // .end method
private Boolean b ( android.content.Context p0, com.google.ads.AdSize p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 244 */
v0 = com.google.ads.util.AdUtil .b ( p1 );
/* if-nez v0, :cond_0 */
/* .line 250 */
int v0 = 0; // const/4 v0, 0x0
/* .line 253 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
/* # virtual methods */
void a ( android.content.Context p0, java.lang.String p1, Integer p2, com.google.ads.AdSize p3, android.util.AttributeSet p4 ) {
/* .locals 7 */
/* .prologue */
/* const/16 v4, 0x11 */
/* .line 151 */
/* if-nez p4, :cond_0 */
/* .line 152 */
p4 = com.google.ads.AdSize.BANNER;
/* .line 155 */
} // :cond_0
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
com.google.ads.AdSize .createAdSize ( p4,v0 );
/* .line 157 */
v0 = (( com.google.ads.AdView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/google/ads/AdView;->getChildCount()I
/* if-nez v0, :cond_1 */
/* .line 159 */
/* if-nez p5, :cond_2 */
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
/* .line 161 */
} // :goto_0
(( android.widget.TextView ) v0 ).setGravity ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V
/* .line 162 */
(( android.widget.TextView ) v0 ).setText ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 163 */
(( android.widget.TextView ) v0 ).setTextColor ( p3 ); // invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V
/* .line 164 */
/* const/high16 v1, -0x1000000 */
(( android.widget.TextView ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
/* .line 167 */
/* if-nez p5, :cond_3 */
/* new-instance v1, Landroid/widget/LinearLayout; */
/* invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 169 */
} // :goto_1
(( android.widget.LinearLayout ) v1 ).setGravity ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 172 */
/* if-nez p5, :cond_4 */
/* new-instance v2, Landroid/widget/LinearLayout; */
/* invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
/* .line 174 */
} // :goto_2
(( android.widget.LinearLayout ) v2 ).setGravity ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V
/* .line 175 */
(( android.widget.LinearLayout ) v2 ).setBackgroundColor ( p3 ); // invoke-virtual {v2, p3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
/* .line 178 */
v4 = (( com.google.ads.AdSize ) v3 ).getWidth ( ); // invoke-virtual {v3}, Lcom/google/ads/AdSize;->getWidth()I
v4 = /* invoke-direct {p0, p1, v4}, Lcom/google/ads/AdView;->a(Landroid/content/Context;I)I */
/* .line 179 */
v3 = (( com.google.ads.AdSize ) v3 ).getHeight ( ); // invoke-virtual {v3}, Lcom/google/ads/AdSize;->getHeight()I
v3 = /* invoke-direct {p0, p1, v3}, Lcom/google/ads/AdView;->a(Landroid/content/Context;I)I */
/* .line 182 */
/* add-int/lit8 v5, v4, -0x2 */
/* add-int/lit8 v6, v3, -0x2 */
(( android.widget.LinearLayout ) v1 ).addView ( v0, v5, v6 ); // invoke-virtual {v1, v0, v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V
/* .line 183 */
(( android.widget.LinearLayout ) v2 ).addView ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
/* .line 184 */
(( com.google.ads.AdView ) p0 ).addView ( v2, v4, v3 ); // invoke-virtual {p0, v2, v4, v3}, Lcom/google/ads/AdView;->addView(Landroid/view/View;II)V
/* .line 186 */
} // :cond_1
return;
/* .line 159 */
} // :cond_2
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1, p5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 167 */
} // :cond_3
/* new-instance v1, Landroid/widget/LinearLayout; */
/* invoke-direct {v1, p1, p5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 172 */
} // :cond_4
/* new-instance v2, Landroid/widget/LinearLayout; */
/* invoke-direct {v2, p1, p5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public void destroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 263 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->b()V
/* .line 264 */
return;
} // .end method
public Boolean isReady ( ) {
/* .locals 1 */
/* .prologue */
/* .line 483 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 484 */
int v0 = 0; // const/4 v0, 0x0
/* .line 487 */
} // :goto_0
} // :cond_0
v0 = this.b;
v0 = (( com.google.ads.internal.d ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->q()Z
} // .end method
public Boolean isRefreshing ( ) {
/* .locals 1 */
/* .prologue */
/* .line 498 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 499 */
int v0 = 0; // const/4 v0, 0x0
/* .line 502 */
} // :goto_0
} // :cond_0
v0 = this.b;
v0 = (( com.google.ads.internal.d ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->r()Z
} // .end method
public void loadAd ( com.google.ads.AdRequest p0 ) {
/* .locals 1 */
/* .param p1, "adRequest" # Lcom/google/ads/AdRequest; */
/* .prologue */
/* .line 514 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 516 */
v0 = (( com.google.ads.AdView ) p0 ).isRefreshing ( ); // invoke-virtual {p0}, Lcom/google/ads/AdView;->isRefreshing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 517 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->e()V
/* .line 521 */
} // :cond_0
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/AdRequest;)V
/* .line 523 */
} // :cond_1
return;
} // .end method
public void setAdListener ( com.google.ads.AdListener p0 ) {
/* .locals 1 */
/* .param p1, "adListener" # Lcom/google/ads/AdListener; */
/* .prologue */
/* .line 534 */
v0 = this.a;
v0 = this.j;
(( com.google.ads.util.i$c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/util/i$c;->a(Ljava/lang/Object;)V
/* .line 535 */
return;
} // .end method
public void stopLoading ( ) {
/* .locals 1 */
/* .prologue */
/* .line 546 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 547 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).z ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->z()V
/* .line 549 */
} // :cond_0
return;
} // .end method
