class com.ansca.corona.AdManager$1 implements java.lang.Runnable {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AdManager;->showInMobiAd(Ljava/lang/String;FFDZ)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
final java.lang.String val$bannerTypeName; //synthetic
final java.lang.String val$copyOfInMobiApplicationId; //synthetic
final Double val$intervalInSeconds; //synthetic
final Boolean val$testModeEnabled; //synthetic
final Float val$x; //synthetic
final Float val$y; //synthetic
/* # direct methods */
 com.ansca.corona.AdManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 275 */
this.this$0 = p1;
this.val$bannerTypeName = p2;
this.val$copyOfInMobiApplicationId = p3;
/* iput-boolean p4, p0, Lcom/ansca/corona/AdManager$1;->val$testModeEnabled:Z */
/* iput p5, p0, Lcom/ansca/corona/AdManager$1;->val$x:F */
/* iput p6, p0, Lcom/ansca/corona/AdManager$1;->val$y:F */
/* iput-wide p7, p0, Lcom/ansca/corona/AdManager$1;->val$intervalInSeconds:D */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 13 */
/* .prologue */
int v12 = 0; // const/4 v12, 0x0
/* const/high16 v5, 0x3f000000 # 0.5f */
/* .line 278 */
v0 = this.this$0;
(( com.ansca.corona.AdManager ) v0 ).hideInMobiAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInMobiAd()V
/* .line 284 */
v0 = this.val$bannerTypeName;
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 285 */
/* .local v11, "lowerCaseBannerTypeName":Ljava/lang/String; */
final String v0 = "banner320x48"; // const-string v0, "banner320x48"
v0 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 286 */
	 /* const/16 v7, 0x9 */
	 /* .line 287 */
	 /* .local v7, "bannerTypeId":I */
	 /* const/16 v8, 0x140 */
	 /* .line 288 */
	 /* .local v8, "bannerWidth":I */
	 /* const/16 v6, 0x30 */
	 /* .line 319 */
	 /* .local v6, "bannerHeight":I */
} // :goto_0
v0 = this.this$0;
com.ansca.corona.AdManager .access$100 ( v0 );
(( android.app.Activity ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v10, v0, Landroid/util/DisplayMetrics;->density:F */
/* .line 320 */
/* .local v10, "displayDensity":F */
/* int-to-float v0, v8 */
/* mul-float/2addr v0, v10 */
/* add-float/2addr v0, v5 */
/* float-to-int v8, v0 */
/* .line 321 */
/* int-to-float v0, v6 */
/* mul-float/2addr v0, v10 */
/* add-float/2addr v0, v5 */
/* float-to-int v6, v0 */
/* .line 324 */
/* new-instance v9, Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate; */
v0 = this.this$0;
v1 = this.val$copyOfInMobiApplicationId;
/* iget-boolean v4, p0, Lcom/ansca/corona/AdManager$1;->val$testModeEnabled:Z */
/* invoke-direct {v9, v0, v1, v4}, Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate;-><init>(Lcom/ansca/corona/AdManager;Ljava/lang/String;Z)V */
/* .line 325 */
/* .local v9, "delegate":Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate; */
} // :goto_1
return;
/* .line 290 */
} // .end local v6 # "bannerHeight":I
} // .end local v7 # "bannerTypeId":I
} // .end local v8 # "bannerWidth":I
} // .end local v9 # "delegate":Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate;
} // .end local v10 # "displayDensity":F
} // :cond_0
final String v0 = "banner300x250"; // const-string v0, "banner300x250"
v0 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 291 */
/* const/16 v7, 0xa */
/* .line 292 */
/* .restart local v7 # "bannerTypeId":I */
/* const/16 v8, 0x12c */
/* .line 293 */
/* .restart local v8 # "bannerWidth":I */
/* const/16 v6, 0xfa */
/* .restart local v6 # "bannerHeight":I */
/* .line 295 */
} // .end local v6 # "bannerHeight":I
} // .end local v7 # "bannerTypeId":I
} // .end local v8 # "bannerWidth":I
} // :cond_1
final String v0 = "banner728x90"; // const-string v0, "banner728x90"
v0 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 296 */
/* const/16 v7, 0xb */
/* .line 297 */
/* .restart local v7 # "bannerTypeId":I */
/* const/16 v8, 0x2d8 */
/* .line 298 */
/* .restart local v8 # "bannerWidth":I */
/* const/16 v6, 0x5a */
/* .restart local v6 # "bannerHeight":I */
/* .line 300 */
} // .end local v6 # "bannerHeight":I
} // .end local v7 # "bannerTypeId":I
} // .end local v8 # "bannerWidth":I
} // :cond_2
final String v0 = "banner468x60"; // const-string v0, "banner468x60"
v0 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 301 */
/* const/16 v7, 0xc */
/* .line 302 */
/* .restart local v7 # "bannerTypeId":I */
/* const/16 v8, 0x1d4 */
/* .line 303 */
/* .restart local v8 # "bannerWidth":I */
/* const/16 v6, 0x3c */
/* .restart local v6 # "bannerHeight":I */
/* .line 305 */
} // .end local v6 # "bannerHeight":I
} // .end local v7 # "bannerTypeId":I
} // .end local v8 # "bannerWidth":I
} // :cond_3
final String v0 = "banner120x600"; // const-string v0, "banner120x600"
v0 = (( java.lang.String ) v11 ).equals ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 306 */
/* const/16 v7, 0xd */
/* .line 307 */
/* .restart local v7 # "bannerTypeId":I */
/* const/16 v8, 0x78 */
/* .line 308 */
/* .restart local v8 # "bannerWidth":I */
/* const/16 v6, 0x258 */
/* .restart local v6 # "bannerHeight":I */
/* .line 311 */
} // .end local v6 # "bannerHeight":I
} // .end local v7 # "bannerTypeId":I
} // .end local v8 # "bannerWidth":I
} // :cond_4
/* const/16 v7, 0x9 */
/* .line 312 */
/* .restart local v7 # "bannerTypeId":I */
/* const/16 v8, 0x140 */
/* .line 313 */
/* .restart local v8 # "bannerWidth":I */
/* const/16 v6, 0x30 */
/* .line 314 */
/* .restart local v6 # "bannerHeight":I */
final String v0 = "Corona"; // const-string v0, "Corona"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "InMobi does not support banner name \'"; // const-string v4, "InMobi does not support banner name \'"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.val$bannerTypeName;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\' given to ads.show() function.Defaulting to \'banner320x48\'."; // const-string v4, "\' given to ads.show() function.Defaulting to \'banner320x48\'."
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* goto/16 :goto_0 */
/* .line 330 */
/* .line 336 */
/* .restart local v9 # "delegate":Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate; */
/* .restart local v10 # "displayDensity":F */
/* iget-wide v0, p0, Lcom/ansca/corona/AdManager$1;->val$intervalInSeconds:D */
/* double-to-long v0, v0 */
/* const-wide/16 v4, 0x3e8 */
/* mul-long v2, v0, v4 */
/* .line 337 */
/* .local v2, "intervalInMilliseconds":J */
v0 = this.this$0;
/* new-instance v1, Ljava/util/Timer; */
/* invoke-direct {v1}, Ljava/util/Timer;-><init>()V */
com.ansca.corona.AdManager .access$302 ( v0,v1 );
/* .line 338 */
v0 = this.this$0;
com.ansca.corona.AdManager .access$300 ( v0 );
/* new-instance v1, Lcom/ansca/corona/AdManager$1$1; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/AdManager$1$1;-><init>(Lcom/ansca/corona/AdManager$1;)V */
/* move-wide v4, v2 */
/* invoke-virtual/range {v0 ..v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V */
/* goto/16 :goto_1 */
} // .end method
