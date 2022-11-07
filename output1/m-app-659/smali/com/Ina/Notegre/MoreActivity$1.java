class com.Ina.Notegre.MoreActivity$1 implements android.view.View$OnClickListener {
	 /* .source "MoreActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/MoreActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.MoreActivity this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.MoreActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 102 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 7 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* const v6, 0x7f040003 */
/* const v5, 0x7f040001 */
int v3 = 0; // const/4 v3, 0x0
/* .line 106 */
v1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* sparse-switch v1, :sswitch_data_0 */
/* .line 144 */
} // :goto_0
return;
/* .line 109 */
/* :sswitch_0 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$0 ( v1 );
/* .line 114 */
/* :sswitch_1 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$1 ( v1 );
/* .line 119 */
/* :sswitch_2 */
v1 = this.this$0;
com.Ina.Notegre.MoreActivity .access$2 ( v1 );
/* .line 124 */
/* :sswitch_3 */
v1 = this.this$0;
/* new-instance v2, Landroid/content/Intent; */
v3 = this.this$0;
/* const-class v4, Lcom/Ina/Notegre/AboutActivity; */
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.Ina.Notegre.MoreActivity ) v1 ).startActivity ( v2 ); // invoke-virtual {v1, v2}, Lcom/Ina/Notegre/MoreActivity;->startActivity(Landroid/content/Intent;)V
/* .line 125 */
v1 = this.this$0;
(( com.Ina.Notegre.MoreActivity ) v1 ).overridePendingTransition ( v6, v5 ); // invoke-virtual {v1, v6, v5}, Lcom/Ina/Notegre/MoreActivity;->overridePendingTransition(II)V
/* .line 131 */
/* :sswitch_4 */
v1 = this.this$0;
/* new-instance v2, Landroid/content/Intent; */
v3 = this.this$0;
/* const-class v4, Lcom/Ina/Notegre/MoreAppActivity; */
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
(( com.Ina.Notegre.MoreActivity ) v1 ).startActivity ( v2 ); // invoke-virtual {v1, v2}, Lcom/Ina/Notegre/MoreActivity;->startActivity(Landroid/content/Intent;)V
/* .line 132 */
v1 = this.this$0;
(( com.Ina.Notegre.MoreActivity ) v1 ).overridePendingTransition ( v6, v5 ); // invoke-virtual {v1, v6, v5}, Lcom/Ina/Notegre/MoreActivity;->overridePendingTransition(II)V
/* .line 137 */
/* :sswitch_5 */
/* new-instance v0, Lcom/Ina/Notegre/MoreActivity$VertionTask; */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lcom/Ina/Notegre/MoreActivity$VertionTask;-><init>(Lcom/Ina/Notegre/MoreActivity;Lcom/Ina/Notegre/MoreActivity$VertionTask;)V */
/* .line 138 */
/* .local v0, "verTask":Lcom/Ina/Notegre/MoreActivity$VertionTask; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Integer; */
java.lang.Integer .valueOf ( v3 );
/* aput-object v2, v1, v3 */
(( com.Ina.Notegre.MoreActivity$VertionTask ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 106 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f090000 -> :sswitch_0 */
/* 0x7f090019 -> :sswitch_1 */
/* 0x7f09001a -> :sswitch_2 */
/* 0x7f09001b -> :sswitch_5 */
/* 0x7f09001c -> :sswitch_3 */
/* 0x7f09001d -> :sswitch_4 */
} // .end sparse-switch
} // .end method
