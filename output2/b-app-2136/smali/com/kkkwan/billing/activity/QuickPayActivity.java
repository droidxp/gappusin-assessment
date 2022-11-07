public class com.kkkwan.billing.activity.QuickPayActivity extends android.app.Activity {
	 /* # instance fields */
	 private java.lang.String a;
	 private java.lang.String b;
	 private java.lang.String c;
	 private java.lang.String d;
	 private java.lang.String e;
	 private java.lang.String f;
	 /* # direct methods */
	 public com.kkkwan.billing.activity.QuickPayActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 6 */
		 try { // :try_start_0
			 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
			 final String v1 = "\u70b9\u51fb\u8d2d\u4e70\u6309\u94ae"; // const-string v1, "\u70b9\u51fb\u8d2d\u4e70\u6309\u94ae"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* new-instance v0, Lcom/kkkwan/billing/g/a; */
			 v2 = this.c;
			 v3 = this.d;
			 v4 = this.e;
			 v5 = this.f;
			 /* move-object v1, p0 */
			 /* invoke-direct/range {v0 ..v5}, Lcom/kkkwan/billing/g/a;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 int v1 = 0; // const/4 v1, 0x0
			 /* new-array v1, v1, [Ljava/lang/Integer; */
			 (( com.kkkwan.billing.g.a ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/g/a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
			 /* new-instance v0, Ljava/lang/Thread; */
			 /* new-instance v1, Lcom/kkkwan/billing/activity/j; */
			 /* invoke-direct {v1, p0}, Lcom/kkkwan/billing/activity/j;-><init>(Lcom/kkkwan/billing/activity/QuickPayActivity;)V */
			 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 static void a ( com.kkkwan.billing.activity.QuickPayActivity p0 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->a()V */
		 return;
	 } // .end method
	 private void b ( ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 /* new-instance v0, Lcom/kkkwan/billing/h/g; */
			 /* invoke-direct {v0}, Lcom/kkkwan/billing/h/g;-><init>()V */
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getApplicationContext()Landroid/content/Context;
			 (( com.kkkwan.billing.h.g ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/h/g;->c(Landroid/content/Context;)Ljava/lang/String;
			 final String v1 = "quick_pay"; // const-string v1, "quick_pay"
			 v2 = this.f;
			 v1 = 			 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 com.kkkwan.billing.f.a .a ( );
				 final String v2 = "2"; // const-string v2, "2"
				 final String v3 = "0"; // const-string v3, "0"
				 (( com.kkkwan.billing.f.a ) v1 ).c ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/kkkwan/billing/f/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
			 } // :cond_0
		 } // :goto_0
		 return;
	 } // :cond_1
	 final String v1 = "quota_pay"; // const-string v1, "quota_pay"
	 v2 = this.f;
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 com.kkkwan.billing.f.a .a ( );
		 final String v2 = "2"; // const-string v2, "2"
		 final String v3 = "0"; // const-string v3, "0"
		 (( com.kkkwan.billing.f.a ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/kkkwan/billing/f/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 static void b ( com.kkkwan.billing.activity.QuickPayActivity p0 ) { //synthethic
		 /* .locals 2 */
		 try { // :try_start_0
			 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
			 final String v1 = "\u70b9\u51fb\u53d6\u6d88\u6309\u94ae"; // const-string v1, "\u70b9\u51fb\u53d6\u6d88\u6309\u94ae"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 /* invoke-direct {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->b()V */
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->finish()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 static java.lang.String c ( com.kkkwan.billing.activity.QuickPayActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.d;
	 } // .end method
	 /* # virtual methods */
	 public void onBackPressed ( ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 /* invoke-direct {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->b()V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V */
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getIntent()Landroid/content/Intent;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 final String v1 = "data"; // const-string v1, "data"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.a = v1;
				 final String v1 = "remark"; // const-string v1, "remark"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.b = v1;
				 final String v1 = "sms_contents"; // const-string v1, "sms_contents"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.c = v1;
				 final String v1 = "ids"; // const-string v1, "ids"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.d = v1;
				 final String v1 = "money"; // const-string v1, "money"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.e = v1;
				 final String v1 = "call_back_type"; // const-string v1, "call_back_type"
				 (( android.content.Intent ) v0 ).getStringExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
				 this.f = v0;
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "remark="; // const-string v2, "remark="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.b;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "data="; // const-string v2, "data="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.a;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "smsContents="; // const-string v2, "smsContents="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.c;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "ids="; // const-string v2, "ids="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.d;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "money="; // const-string v2, "money="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.e;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "callbackType="; // const-string v2, "callbackType="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.f;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 final String v0 = "quota_pay"; // const-string v0, "quota_pay"
				 v1 = this.f;
				 v0 = 				 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 final String v0 = "QuickPayActivity"; // const-string v0, "QuickPayActivity"
					 final String v1 = "\u4e0d\u663e\u793a\u6263\u8d39\u6846\uff0c\u76f4\u63a5\u53d1\u77ed\u4fe1\u6263\u8d39"; // const-string v1, "\u4e0d\u663e\u793a\u6263\u8d39\u6846\uff0c\u76f4\u63a5\u53d1\u77ed\u4fe1\u6263\u8d39"
					 com.kkkwan.billing.h.f .a ( v0,v1 );
					 /* invoke-direct {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->a()V */
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :cond_0
			 } // :goto_0
			 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
			 return;
		 } // :cond_1
		 try { // :try_start_1
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getResources()Landroid/content/res/Resources;
			 final String v1 = "kkkwan_quick_pay"; // const-string v1, "kkkwan_quick_pay"
			 final String v2 = "layout"; // const-string v2, "layout"
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getPackageName()Ljava/lang/String;
			 v0 = 			 (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->setContentView(I)V
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getResources()Landroid/content/res/Resources;
				 final String v1 = "kkkwan_title"; // const-string v1, "kkkwan_title"
				 final String v2 = "id"; // const-string v2, "id"
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getPackageName()Ljava/lang/String;
				 v0 = 				 (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->findViewById(I)Landroid/view/View;
				 /* check-cast v0, Landroid/widget/TextView; */
				 final String v1 = "QuickPayActivity"; // const-string v1, "QuickPayActivity"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 final String v3 = "title="; // const-string v3, "title="
				 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v1,v2 );
				 v1 = this.a;
				 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 } // :cond_2
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_3
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getResources()Landroid/content/res/Resources;
				 final String v1 = "kkkwan_content"; // const-string v1, "kkkwan_content"
				 final String v2 = "id"; // const-string v2, "id"
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getPackageName()Ljava/lang/String;
				 v0 = 				 (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
				 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->findViewById(I)Landroid/view/View;
				 /* check-cast v0, Landroid/widget/TextView; */
				 final String v1 = "QuickPayActivity"; // const-string v1, "QuickPayActivity"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 final String v3 = "content_tv="; // const-string v3, "content_tv="
				 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v1,v2 );
				 v1 = this.b;
				 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 } // :cond_3
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getResources()Landroid/content/res/Resources;
			 final String v1 = "kkkwan_buy"; // const-string v1, "kkkwan_buy"
			 final String v2 = "id"; // const-string v2, "id"
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getPackageName()Ljava/lang/String;
			 v0 = 			 (( android.content.res.Resources ) v0 ).getIdentifier ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/Button; */
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getResources()Landroid/content/res/Resources;
			 final String v2 = "kkkwan_cancel"; // const-string v2, "kkkwan_cancel"
			 final String v3 = "id"; // const-string v3, "id"
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/QuickPayActivity;->getPackageName()Ljava/lang/String;
			 v1 = 			 (( android.content.res.Resources ) v1 ).getIdentifier ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
			 (( com.kkkwan.billing.activity.QuickPayActivity ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/kkkwan/billing/activity/QuickPayActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v1, Landroid/widget/Button; */
			 /* new-instance v2, Lcom/kkkwan/billing/activity/g; */
			 /* invoke-direct {v2, p0}, Lcom/kkkwan/billing/activity/g;-><init>(Lcom/kkkwan/billing/activity/QuickPayActivity;)V */
			 (( android.widget.Button ) v0 ).setOnClickListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
			 /* new-instance v0, Lcom/kkkwan/billing/activity/h; */
			 /* invoke-direct {v0, p0}, Lcom/kkkwan/billing/activity/h;-><init>(Lcom/kkkwan/billing/activity/QuickPayActivity;)V */
			 (( android.widget.Button ) v1 ).setOnClickListener ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
			 /* new-instance v0, Ljava/lang/Thread; */
			 /* new-instance v1, Lcom/kkkwan/billing/activity/i; */
			 /* invoke-direct {v1, p0}, Lcom/kkkwan/billing/activity/i;-><init>(Lcom/kkkwan/billing/activity/QuickPayActivity;)V */
			 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* goto/16 :goto_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
			 /* goto/16 :goto_0 */
		 } // .end method
