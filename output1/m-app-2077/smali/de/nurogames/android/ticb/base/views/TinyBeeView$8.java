class de.nurogames.android.ticb.base.views.TinyBeeView$8 implements android.content.DialogInterface$OnClickListener {
	 /* .source "TinyBeeView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/views/TinyBeeView;->showRatingDialog()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.TinyBeeView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.TinyBeeView$8 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1595 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "id" # I */
/* .prologue */
/* .line 1600 */
/* sget-boolean v1, Lde/nurogames/android/ticb/base/core/AppResources;->AMAZON_BUILD:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 1601 */
	 /* new-instance v0, Landroid/content/Intent; */
	 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "http://www.amazon.com/gp/mas/dl/android?p="; // const-string v3, "http://www.amazon.com/gp/mas/dl/android?p="
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.FULL_PACKAGE;
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = "&showAll=1."; // const-string v3, "&showAll=1."
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.net.Uri .parse ( v2 );
	 /* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
	 /* .line 1605 */
	 /* .local v0, "myIntent":Landroid/content/Intent; */
} // :goto_0
v1 = this.this$0;
(( de.nurogames.android.ticb.base.views.TinyBeeView ) v1 ).getContext ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 1607 */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v1 ).init ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 1609 */
v1 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v1 ).setUserRated ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/DataManager;->setUserRated()V
/* .line 1610 */
return;
/* .line 1603 */
} // .end local v0 # "myIntent":Landroid/content/Intent;
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "https://play.google.com/store/apps/details?id="; // const-string v3, "https://play.google.com/store/apps/details?id="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = de.nurogames.android.ticb.base.core.AppResources.FULL_PACKAGE;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v2 );
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .restart local v0 # "myIntent":Landroid/content/Intent; */
} // .end method
