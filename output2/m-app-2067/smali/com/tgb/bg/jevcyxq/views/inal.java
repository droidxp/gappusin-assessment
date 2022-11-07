class inal implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private com.tgb.bg.jevcyxq.views.TGBMainGameActivity a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 5 */
		 try { // :try_start_0
			 v0 = this.a;
			 com.tgb.bg.jevcyxq.views.TGBMainGameActivity .h ( v0 );
			 final String v1 = "RATE US"; // const-string v1, "RATE US"
			 (( com.tgb.bg.jevcyxq.c.ac ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->e(Ljava/lang/String;)V
			 v0 = this.a;
			 com.tgb.bg.jevcyxq.views.TGBMainGameActivity .h ( v0 );
			 /* const/16 v1, 0xa */
			 (( com.tgb.bg.jevcyxq.c.ac ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->a(I)V
			 v0 = this.a;
			 /* new-instance v1, Landroid/content/Intent; */
			 final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 final String v4 = "market://details?id="; // const-string v4, "market://details?id="
			 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v4 = this.a;
			 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).getPackageName ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.net.Uri .parse ( v3 );
			 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
			 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->startActivity(Landroid/content/Intent;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
t v0, Landroid/widget/Button; */
		 this.d = v0;
		 v0 = this.d;
		 (( android.widget.Button ) v0 ).setOnClickListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 try { // :try_start_0
			 v0 = this.b;
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.Button ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V
			 v0 = this.c;
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.Button ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V
			 v0 = this.a;
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.Button ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f070010 */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f07000f */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f070013 */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f070012 */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f070016 */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f07000c */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* const v0, 0x7f070015 */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->getContext()Landroid/content/Context;
			 com.tgb.bg.jevcyxq.d.a .a ( v1 );
			 (( android.widget.TextView ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = this.e;
		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l()Lcom/tgb/bg/jevcyxq/c/ac;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "SCORE"; // const-string v2, "SCORE"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v2 = this.e;
		 v2 = 		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 v2 = this.e;
		 v2 = 		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v1 = 		 (( com.tgb.bg.jevcyxq.c.ac ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->a(Ljava/lang/String;)I
		 /* const v0, 0x459c4000 # 5000.0f */
		 v2 = this.e;
		 v2 = 		 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->b()F
		 /* const/high16 v3, 0x40a00000 # 5.0f */
		 /* div-float/2addr v2, v3 */
		 /* const/high16 v3, 0x43480000 # 200.0f */
		 /* mul-float/2addr v2, v3 */
		 /* sub-float/2addr v0, v2 */
		 /* float-to-int v0, v0 */
		 /* if-gez v0, :cond_1 */
		 /* move v2, v6 */
	 } // :goto_1
	 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v4 ); // invoke-virtual {p0, v4}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 v4 = this.e;
	 v4 = 	 (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->b()F
	 v4 = 	 java.lang.Math .round ( v4 );
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v7 ); // invoke-virtual {p0, v7}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* if-le v1, v2, :cond_0 */
	 (( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :goto_2
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).setCancelable ( v6 ); // invoke-virtual {p0, v6}, Lcom/tgb/bg/jevcyxq/views/aa;->setCancelable(Z)V
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).setOnDismissListener ( p0 ); // invoke-virtual {p0, p0}, Lcom/tgb/bg/jevcyxq/views/aa;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
return;
} // :cond_0
v0 = this.e;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->l()Lcom/tgb/bg/jevcyxq/c/ac;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v3 = "SCORE"; // const-string v3, "SCORE"
/* invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.e;
v3 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v3 = this.e;
v3 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.tgb.bg.jevcyxq.c.ac ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lcom/tgb/bg/jevcyxq/c/ac;->a(ILjava/lang/String;)V
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* :catch_0 */
/* move-exception v0 */
/* goto/16 :goto_0 */
} // :cond_1
/* move v2, v0 */
/* goto/16 :goto_1 */
} // .end method
static com.tgb.bg.jevcyxq.views.TGBMainGameActivity a ( com.tgb.bg.jevcyxq.views.aa p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
/* # virtual methods */
protected final android.view.View a ( ) {
/* .locals 1 */
/* const/high16 v0, 0x7f070000 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/tgb/bg/jevcyxq/views/aa;->findViewById(I)Landroid/view/View;
} // .end method
public final void onClick ( android.view.View p0 ) {
/* .locals 3 */
v0 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* sparse-switch v0, :sswitch_data_0 */
} // :goto_0
return;
/* :sswitch_0 */
v0 = this.e;
v0 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
/* const/16 v1, 0xc */
/* if-ge v0, v1, :cond_0 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->dismiss()V
try { // :try_start_0
v0 = this.e;
v1 = this.e;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
v2 = this.e;
v2 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
/* add-int/lit8 v2, v2, 0x1 */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a(II)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :catch_1 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_0
v0 = this.e;
/* new-instance v1, Lcom/tgb/bg/jevcyxq/views/p; */
/* invoke-direct {v1, p0}, Lcom/tgb/bg/jevcyxq/views/p;-><init>(Lcom/tgb/bg/jevcyxq/views/aa;)V */
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* :sswitch_1 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->dismiss()V
try { // :try_start_1
v0 = this.e;
v1 = this.e;
v1 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a()I
v2 = this.e;
v2 = (( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->c()I
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->a(II)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* :catch_2 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* :catch_3 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :sswitch_2 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->dismiss()V
v0 = this.e;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->finish()V
/* :sswitch_3 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->dismiss()V
v0 = this.e;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->finish()V
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f070008 -> :sswitch_3 */
/* 0x7f070019 -> :sswitch_1 */
/* 0x7f07001b -> :sswitch_0 */
/* 0x7f07001d -> :sswitch_2 */
} // .end sparse-switch
} // .end method
public final void onDismiss ( android.content.DialogInterface p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lcom/tgb/bg/jevcyxq/refurbished/l;->onDismiss(Landroid/content/DialogInterface;)V */
return;
} // .end method
public final Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
(( com.tgb.bg.jevcyxq.views.aa ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/aa;->dismiss()V
v0 = this.e;
(( com.tgb.bg.jevcyxq.views.TGBMainGameActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/views/TGBMainGameActivity;->finish()V
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Lcom/tgb/bg/jevcyxq/refurbished/l;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public final void show ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/l;->show()V */
return;
} // .end method
