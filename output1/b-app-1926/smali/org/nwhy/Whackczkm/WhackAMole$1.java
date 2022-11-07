class org.nwhy.Whackczkm.WhackAMole$1 implements android.view.View$OnClickListener {
	 /* .source "WhackAMole.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/nwhy/Whackczkm/WhackAMole; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.nwhy.Whackczkm.WhackAMole this$0; //synthetic
/* # direct methods */
 org.nwhy.Whackczkm.WhackAMole$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 52 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 4 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 54 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 55 */
/* .local v0, "intent":Landroid/content/Intent; */
v2 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* packed-switch v2, :pswitch_data_0 */
/* .line 81 */
} // :goto_0
return;
/* .line 57 */
/* :pswitch_0 */
v2 = this.this$0;
/* const-class v3, Lorg/nwhy/Whackczkm/Game; */
(( android.content.Intent ) v0 ).setClass ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 58 */
v2 = this.this$0;
(( org.nwhy.Whackczkm.WhackAMole ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->startActivity(Landroid/content/Intent;)V
/* .line 61 */
/* :pswitch_1 */
v2 = this.this$0;
/* const-class v3, Lorg/nwhy/Whackczkm/About; */
(( android.content.Intent ) v0 ).setClass ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 62 */
v2 = this.this$0;
(( org.nwhy.Whackczkm.WhackAMole ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->startActivity(Landroid/content/Intent;)V
/* .line 65 */
/* :pswitch_2 */
final String v2 = "market://search?q=pub:DFdou"; // const-string v2, "market://search?q=pub:DFdou"
android.net.Uri .parse ( v2 );
/* .line 66 */
/* .local v1, "uri":Landroid/net/Uri; */
/* new-instance v0, Landroid/content/Intent; */
} // .end local v0 # "intent":Landroid/content/Intent;
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 67 */
/* .restart local v0 # "intent":Landroid/content/Intent; */
v2 = this.this$0;
(( org.nwhy.Whackczkm.WhackAMole ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->startActivity(Landroid/content/Intent;)V
/* .line 70 */
} // .end local v1 # "uri":Landroid/net/Uri;
/* :pswitch_3 */
v2 = this.this$0;
/* const-class v3, Lorg/nwhy/Whackczkm/VSGame; */
(( android.content.Intent ) v0 ).setClass ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 71 */
v2 = this.this$0;
(( org.nwhy.Whackczkm.WhackAMole ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lorg/nwhy/Whackczkm/WhackAMole;->startActivity(Landroid/content/Intent;)V
/* .line 75 */
/* :pswitch_4 */
final String v2 = "d69ea7d5cdfb3516"; // const-string v2, "d69ea7d5cdfb3516"
com.wiyun.game.WiGame .openLeaderboard ( v2 );
/* .line 78 */
/* :pswitch_5 */
v2 = this.this$0;
(( org.nwhy.Whackczkm.WhackAMole ) v2 ).finish ( ); // invoke-virtual {v2}, Lorg/nwhy/Whackczkm/WhackAMole;->finish()V
/* .line 55 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x7f0b0002 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
