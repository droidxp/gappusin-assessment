class com.ansca.corona.AdManager$3 implements java.lang.Runnable {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AdManager;->showInneractiveAd(Ljava/lang/String;III)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
final Object val$adTypeId; //synthetic
final java.lang.String val$copyOfInneractiveApplicationId; //synthetic
final Integer val$finalIntervalInSeconds; //synthetic
final Integer val$x; //synthetic
final Integer val$y; //synthetic
/* # direct methods */
 com.ansca.corona.AdManager$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 575 */
this.this$0 = p1;
this.val$copyOfInneractiveApplicationId = p2;
/* iput-byte p3, p0, Lcom/ansca/corona/AdManager$3;->val$adTypeId:B */
/* iput p4, p0, Lcom/ansca/corona/AdManager$3;->val$finalIntervalInSeconds:I */
/* iput p5, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* iput p6, p0, Lcom/ansca/corona/AdManager$3;->val$y:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 14 */
/* .prologue */
int v13 = -1; // const/4 v13, -0x1
int v12 = 0; // const/4 v12, 0x0
int v11 = 2; // const/4 v11, 0x2
/* .line 578 */
v6 = this.this$0;
(( com.ansca.corona.AdManager ) v6 ).hideInneractiveAd ( ); // invoke-virtual {v6}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
/* .line 582 */
v6 = this.this$0;
com.ansca.corona.AdManager .access$100 ( v6 );
v7 = this.val$copyOfInneractiveApplicationId;
/* iget-byte v8, p0, Lcom/ansca/corona/AdManager$3;->val$adTypeId:B */
/* iget v9, p0, Lcom/ansca/corona/AdManager$3;->val$finalIntervalInSeconds:I */
com.inneractive.api.ads.InneractiveAdComponent .getAdView ( v6,v7,v8,v9 );
/* .line 584 */
/* .local v3, "inneractiveAdView":Lcom/inneractive/api/ads/InneractiveAdView; */
/* if-nez v3, :cond_0 */
/* .line 644 */
} // :goto_0
return;
/* .line 587 */
} // :cond_0
v6 = this.this$0;
/* new-instance v7, Landroid/widget/RelativeLayout; */
v8 = this.this$0;
com.ansca.corona.AdManager .access$100 ( v8 );
/* invoke-direct {v7, v8}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
com.ansca.corona.AdManager .access$502 ( v6,v7 );
/* .line 588 */
v6 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v6 );
(( android.view.ViewGroup ) v6 ).addView ( v3 ); // invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 592 */
/* const/16 v7, 0xb */
/* if-lt v6, v7, :cond_1 */
/* .line 594 */
try { // :try_start_0
/* const-class v6, Landroid/view/ViewGroup; */
final String v7 = "setLayerType"; // const-string v7, "setLayerType"
int v8 = 2; // const/4 v8, 0x2
/* new-array v8, v8, [Ljava/lang/Class; */
int v9 = 0; // const/4 v9, 0x0
v10 = java.lang.Integer.TYPE;
/* aput-object v10, v8, v9 */
int v9 = 1; // const/4 v9, 0x1
/* const-class v10, Landroid/graphics/Paint; */
/* aput-object v10, v8, v9 */
(( java.lang.Class ) v6 ).getMethod ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 596 */
/* .local v5, "setLayerTypeMethod":Ljava/lang/reflect/Method; */
v6 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v6 );
int v7 = 2; // const/4 v7, 0x2
/* new-array v7, v7, [Ljava/lang/Object; */
int v8 = 0; // const/4 v8, 0x0
int v9 = 1; // const/4 v9, 0x1
java.lang.Integer .valueOf ( v9 );
/* aput-object v9, v7, v8 */
int v8 = 1; // const/4 v8, 0x1
int v9 = 0; // const/4 v9, 0x0
/* aput-object v9, v7, v8 */
(( java.lang.reflect.Method ) v5 ).invoke ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 602 */
} // .end local v5 # "setLayerTypeMethod":Ljava/lang/reflect/Method;
} // :cond_1
} // :goto_1
/* iget-byte v6, p0, Lcom/ansca/corona/AdManager$3;->val$adTypeId:B */
/* if-ne v6, v11, :cond_2 */
/* .line 605 */
/* new-instance v6, Lcom/ansca/corona/AdManager$CoronaInneractiveFullscreenAdListener; */
v7 = this.this$0;
/* invoke-direct {v6, v7, v12}, Lcom/ansca/corona/AdManager$CoronaInneractiveFullscreenAdListener;-><init>(Lcom/ansca/corona/AdManager;Lcom/ansca/corona/AdManager$1;)V */
(( com.inneractive.api.ads.InneractiveAdView ) v3 ).setListener ( v6 ); // invoke-virtual {v3, v6}, Lcom/inneractive/api/ads/InneractiveAdView;->setListener(Lcom/inneractive/api/ads/InneractiveAdEventsListener;)V
/* .line 606 */
/* new-instance v4, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v4, v13, v13}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 608 */
/* .local v4, "params":Landroid/widget/RelativeLayout$LayoutParams; */
v6 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v6 );
(( android.view.ViewGroup ) v6 ).setLayoutParams ( v4 ); // invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 609 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v6 ).getAbsoluteLayout ( ); // invoke-virtual {v6}, Lcom/ansca/corona/ViewManager;->getAbsoluteLayout()Landroid/widget/AbsoluteLayout;
v7 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v7 );
(( android.widget.AbsoluteLayout ) v6 ).addView ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/AbsoluteLayout;->addView(Landroid/view/View;)V
/* .line 614 */
} // .end local v4 # "params":Landroid/widget/RelativeLayout$LayoutParams;
} // :cond_2
/* new-instance v6, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener; */
v7 = this.this$0;
/* invoke-direct {v6, v7, v12}, Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;-><init>(Lcom/ansca/corona/AdManager;Lcom/ansca/corona/AdManager$1;)V */
(( com.inneractive.api.ads.InneractiveAdView ) v3 ).setListener ( v6 ); // invoke-virtual {v3, v6}, Lcom/inneractive/api/ads/InneractiveAdView;->setListener(Lcom/inneractive/api/ads/InneractiveAdEventsListener;)V
/* .line 618 */
/* const/16 v6, 0x8 */
(( com.inneractive.api.ads.InneractiveAdView ) v3 ).setVisibility ( v6 ); // invoke-virtual {v3, v6}, Lcom/inneractive/api/ads/InneractiveAdView;->setVisibility(I)V
/* .line 621 */
v1 = com.ansca.corona.JavaToNativeShim .getContentWidthInPixels ( );
/* .line 622 */
/* .local v1, "contentWidth":I */
v2 = com.ansca.corona.JavaToNativeShim .getHorizontalMarginInPixels ( );
/* .line 624 */
/* .local v2, "horizontalMargin":I */
/* iget v6, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* if-lt v6, v2, :cond_3 */
/* iget v6, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* add-int v7, v1, v2 */
/* if-ge v6, v7, :cond_3 */
/* .line 627 */
/* iget v6, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* sub-int/2addr v6, v2 */
/* sub-int v0, v1, v6 */
/* .line 640 */
/* .local v0, "adWidth":I */
} // :goto_2
/* new-instance v4, Landroid/widget/AbsoluteLayout$LayoutParams; */
int v6 = -2; // const/4 v6, -0x2
/* iget v7, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* iget v8, p0, Lcom/ansca/corona/AdManager$3;->val$y:I */
/* invoke-direct {v4, v0, v6, v7, v8}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V */
/* .line 642 */
/* .local v4, "params":Landroid/widget/AbsoluteLayout$LayoutParams; */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v6 ).getAbsoluteLayout ( ); // invoke-virtual {v6}, Lcom/ansca/corona/ViewManager;->getAbsoluteLayout()Landroid/widget/AbsoluteLayout;
v7 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v7 );
(( android.widget.AbsoluteLayout ) v6 ).addView ( v7, v4 ); // invoke-virtual {v6, v7, v4}, Landroid/widget/AbsoluteLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* goto/16 :goto_0 */
/* .line 629 */
} // .end local v0 # "adWidth":I
} // .end local v4 # "params":Landroid/widget/AbsoluteLayout$LayoutParams;
} // :cond_3
/* iget v6, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* if-ge v6, v2, :cond_4 */
/* .line 632 */
/* iget v6, p0, Lcom/ansca/corona/AdManager$3;->val$x:I */
/* sub-int v6, v2, v6 */
/* mul-int/lit8 v6, v6, 0x2 */
/* add-int v0, v1, v6 */
/* .restart local v0 # "adWidth":I */
/* .line 636 */
} // .end local v0 # "adWidth":I
} // :cond_4
int v0 = -2; // const/4 v0, -0x2
/* .line 637 */
/* .restart local v0 # "adWidth":I */
v6 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v6 );
/* const/16 v7, 0x8 */
(( android.view.ViewGroup ) v6 ).setVisibility ( v7 ); // invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->setVisibility(I)V
/* .line 598 */
} // .end local v0 # "adWidth":I
} // .end local v1 # "contentWidth":I
} // .end local v2 # "horizontalMargin":I
/* :catch_0 */
/* move-exception v6 */
/* goto/16 :goto_1 */
} // .end method
