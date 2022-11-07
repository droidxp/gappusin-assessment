class com.Ina.adapter.MoreAppAdapter$1 implements android.view.View$OnClickListener {
	 /* .source "MoreAppAdapter.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/adapter/MoreAppAdapter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.adapter.MoreAppAdapter this$0; //synthetic
/* # direct methods */
 com.Ina.adapter.MoreAppAdapter$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 87 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 5 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 93 */
(( android.view.View ) p1 ).getTag ( ); // invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 94 */
/* .local v2, "url":Ljava/lang/String; */
v3 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* packed-switch v3, :pswitch_data_0 */
/* .line 115 */
} // :goto_0
return;
/* .line 98 */
/* :pswitch_0 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 99 */
/* .local v1, "intent":Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
(( android.content.Intent ) v1 ).setAction ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
/* .line 100 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "market://details?id=<"; // const-string v4, "market://details?id=<"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ">"; // const-string v4, ">"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .parse ( v3 );
(( android.content.Intent ) v1 ).setData ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 101 */
v3 = this.this$0;
com.Ina.adapter.MoreAppAdapter .access$0 ( v3 );
(( android.content.Context ) v3 ).startActivity ( v1 ); // invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 107 */
} // .end local v1 # "intent":Landroid/content/Intent;
/* :pswitch_1 */
/* new-instance v0, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
/* .line 108 */
android.net.Uri .parse ( v2 );
/* .line 107 */
/* invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 109 */
/* .local v0, "fIntent":Landroid/content/Intent; */
v3 = this.this$0;
com.Ina.adapter.MoreAppAdapter .access$0 ( v3 );
(( android.content.Context ) v3 ).startActivity ( v0 ); // invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 94 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x7f09000a */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
