class com.Ina.Notegre.ReadText$1 implements android.view.View$OnClickListener {
	 /* .source "ReadText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/ReadText; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.ReadText this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.ReadText$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 176 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 4 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 180 */
v2 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* sparse-switch v2, :sswitch_data_0 */
/* .line 233 */
} // :cond_0
} // :goto_0
return;
/* .line 183 */
/* :sswitch_0 */
v2 = this.this$0;
com.Ina.Notegre.ReadText .access$0 ( v2 );
/* .line 188 */
/* :sswitch_1 */
v2 = this.this$0;
v2 = com.Ina.Notegre.ReadText .access$1 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 190 */
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
com.Ina.Notegre.ReadText .access$2 ( v2,v3 );
/* .line 192 */
v2 = this.this$0;
com.Ina.Notegre.ReadText .access$0 ( v2 );
/* .line 198 */
/* :sswitch_2 */
v2 = this.this$0;
com.Ina.Notegre.ReadText .access$3 ( v2 );
/* .line 203 */
/* :sswitch_3 */
/* new-instance v1, Landroid/content/Intent; */
/* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
/* .line 204 */
/* .local v1, "intent":Landroid/content/Intent; */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 205 */
/* .local v0, "bundle":Landroid/os/Bundle; */
final String v2 = "_id"; // const-string v2, "_id"
v3 = com.Ina.Notegre.ReadText .access$4 ( );
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 206 */
final String v2 = "Index"; // const-string v2, "Index"
v3 = com.Ina.Notegre.ReadText .access$5 ( );
(( android.os.Bundle ) v0 ).putInt ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
/* .line 207 */
final String v2 = "Title"; // const-string v2, "Title"
com.Ina.Notegre.ReadText .access$6 ( );
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 208 */
final String v2 = "Content"; // const-string v2, "Content"
com.Ina.Notegre.ReadText .access$7 ( );
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 209 */
(( android.content.Intent ) v1 ).putExtras ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 211 */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
(( com.Ina.Notegre.ReadText ) v2 ).setResult ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Lcom/Ina/Notegre/ReadText;->setResult(ILandroid/content/Intent;)V
/* .line 213 */
v2 = this.this$0;
(( com.Ina.Notegre.ReadText ) v2 ).finish ( ); // invoke-virtual {v2}, Lcom/Ina/Notegre/ReadText;->finish()V
/* .line 218 */
} // .end local v0 # "bundle":Landroid/os/Bundle;
} // .end local v1 # "intent":Landroid/content/Intent;
/* :sswitch_4 */
v2 = this.this$0;
v2 = com.Ina.Notegre.ReadText .access$8 ( v2 );
/* const/16 v3, 0x1e */
/* if-ge v2, v3, :cond_1 */
/* .line 219 */
v2 = this.this$0;
v3 = com.Ina.Notegre.ReadText .access$8 ( v2 );
/* add-int/lit8 v3, v3, 0x1 */
com.Ina.Notegre.ReadText .access$9 ( v2,v3 );
/* .line 220 */
} // :cond_1
v2 = this.this$0;
com.Ina.Notegre.ReadText .access$10 ( v2 );
v3 = this.this$0;
v3 = com.Ina.Notegre.ReadText .access$8 ( v3 );
/* int-to-float v3, v3 */
(( android.widget.TextView ) v2 ).setTextSize ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V
/* goto/16 :goto_0 */
/* .line 225 */
/* :sswitch_5 */
v2 = this.this$0;
v2 = com.Ina.Notegre.ReadText .access$8 ( v2 );
/* const/16 v3, 0x10 */
/* if-le v2, v3, :cond_2 */
/* .line 226 */
v2 = this.this$0;
v3 = com.Ina.Notegre.ReadText .access$8 ( v2 );
/* add-int/lit8 v3, v3, -0x1 */
com.Ina.Notegre.ReadText .access$9 ( v2,v3 );
/* .line 227 */
} // :cond_2
v2 = this.this$0;
com.Ina.Notegre.ReadText .access$10 ( v2 );
v3 = this.this$0;
v3 = com.Ina.Notegre.ReadText .access$8 ( v3 );
/* int-to-float v3, v3 */
(( android.widget.TextView ) v2 ).setTextSize ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V
/* goto/16 :goto_0 */
/* .line 180 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f090000 -> :sswitch_2 */
/* 0x7f090002 -> :sswitch_0 */
/* 0x7f09000e -> :sswitch_1 */
/* 0x7f090010 -> :sswitch_3 */
/* 0x7f090011 -> :sswitch_4 */
/* 0x7f090012 -> :sswitch_5 */
} // .end sparse-switch
} // .end method
