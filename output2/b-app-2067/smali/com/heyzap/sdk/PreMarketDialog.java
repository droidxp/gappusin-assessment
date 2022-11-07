class com.heyzap.sdk.PreMarketDialog extends com.heyzap.sdk.HeyzapDialog {
	 /* # static fields */
	 private static final java.lang.String LOG_TAG;
	 /* # instance fields */
	 protected android.graphics.drawable.Drawable gameIcon;
	 protected java.lang.String gameName;
	 protected java.lang.String packageName;
	 /* # direct methods */
	 public com.heyzap.sdk.PreMarketDialog ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/HeyzapDialog;-><init>(Landroid/content/Context;)V */
		 this.packageName = p2;
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 (( android.content.pm.PackageManager ) v0 ).getApplicationIcon ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
			 this.gameIcon = v0;
			 com.heyzap.sdk.Utils .getAppLabel ( p1 );
			 this.gameName = v0;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* invoke-direct {p0}, Lcom/heyzap/sdk/PreMarketDialog;->buildDialogContentView()Landroid/view/View; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).setView ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/PreMarketDialog;->setView(Landroid/view/View;)V
		 final String v0 = "Install Heyzap"; // const-string v0, "Install Heyzap"
		 /* new-instance v1, Lcom/heyzap/sdk/PreMarketDialog$1; */
		 /* invoke-direct {v1, p0, p1}, Lcom/heyzap/sdk/PreMarketDialog$1;-><init>(Lcom/heyzap/sdk/PreMarketDialog;Landroid/content/Context;)V */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).addPrimaryButton ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/heyzap/sdk/PreMarketDialog;->addPrimaryButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
		 final String v0 = "Skip"; // const-string v0, "Skip"
		 /* new-instance v1, Lcom/heyzap/sdk/PreMarketDialog$2; */
		 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/PreMarketDialog$2;-><init>(Lcom/heyzap/sdk/PreMarketDialog;)V */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).addSecondaryButton ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/heyzap/sdk/PreMarketDialog;->addSecondaryButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( android.content.pm.PackageManager$NameNotFoundException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
	 } // .end method
	 private android.view.View buildDialogContentView ( ) {
		 /* .locals 13 */
		 /* const/high16 v12, 0x428c0000 # 70.0f */
		 /* const/high16 v7, 0x42480000 # 50.0f */
		 /* const/16 v11, 0x10 */
		 int v10 = -1; // const/4 v10, -0x1
		 int v9 = 0; // const/4 v9, 0x0
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* const/high16 v1, 0x41200000 # 10.0f */
		 /* mul-float/2addr v1, v0 */
		 /* float-to-int v1, v1 */
		 /* new-instance v2, Landroid/widget/LinearLayout$LayoutParams; */
		 int v3 = -2; // const/4 v3, -0x2
		 /* invoke-direct {v2, v10, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 /* new-instance v3, Landroid/widget/LinearLayout; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 int v4 = 1; // const/4 v4, 0x1
		 (( android.widget.LinearLayout ) v3 ).setOrientation ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V
		 /* new-instance v4, Landroid/widget/LinearLayout; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 (( android.widget.LinearLayout ) v4 ).setPadding ( v1, v1, v1, v1 ); // invoke-virtual {v4, v1, v1, v1, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V
		 (( android.widget.LinearLayout ) v4 ).setGravity ( v11 ); // invoke-virtual {v4, v11}, Landroid/widget/LinearLayout;->setGravity(I)V
		 /* new-instance v5, Landroid/widget/LinearLayout$LayoutParams; */
		 /* mul-float v6, v0, v7 */
		 /* float-to-int v6, v6 */
		 /* mul-float/2addr v7, v0 */
		 /* float-to-int v7, v7 */
		 /* invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 (( android.widget.LinearLayout$LayoutParams ) v5 ).setMargins ( v9, v9, v1, v9 ); // invoke-virtual {v5, v9, v9, v1, v9}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
		 /* new-instance v6, Landroid/widget/ImageView; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v6, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 v7 = this.gameIcon;
		 (( android.widget.ImageView ) v6 ).setImageDrawable ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 (( android.widget.LinearLayout ) v4 ).addView ( v6, v5 ); // invoke-virtual {v4, v6, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v5, Landroid/widget/LinearLayout$LayoutParams; */
		 int v6 = -2; // const/4 v6, -0x2
		 /* invoke-direct {v5, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 /* new-instance v6, Landroid/widget/TextView; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 int v7 = 2; // const/4 v7, 0x2
		 /* const/high16 v8, 0x41880000 # 17.0f */
		 (( android.widget.TextView ) v6 ).setTextSize ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Landroid/widget/TextView;->setTextSize(IF)V
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v8 = "Check in to "; // const-string v8, "Check in to "
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v8 = this.gameName;
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.widget.TextView ) v6 ).setText ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 v7 = android.graphics.Typeface.DEFAULT_BOLD;
		 (( android.widget.TextView ) v6 ).setTypeface ( v7 ); // invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
		 (( android.widget.TextView ) v6 ).setGravity ( v11 ); // invoke-virtual {v6, v11}, Landroid/widget/TextView;->setGravity(I)V
		 (( android.widget.TextView ) v6 ).setTextColor ( v10 ); // invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V
		 (( android.widget.LinearLayout ) v4 ).addView ( v6, v5 ); // invoke-virtual {v4, v6, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 (( android.widget.LinearLayout ) v3 ).addView ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v4, Landroid/widget/ImageView; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 final String v6 = "dialog_separator.png"; // const-string v6, "dialog_separator.png"
		 com.heyzap.sdk.Drawables .setImageDrawable ( v5,v4,v6 );
		 (( android.widget.LinearLayout ) v3 ).addView ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v4, Landroid/widget/LinearLayout; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 /* mul-int/lit8 v5, v1, 0x2 */
		 (( android.widget.LinearLayout ) v4 ).setPadding ( v1, v1, v1, v5 ); // invoke-virtual {v4, v1, v1, v1, v5}, Landroid/widget/LinearLayout;->setPadding(IIII)V
		 (( android.widget.LinearLayout ) v4 ).setGravity ( v11 ); // invoke-virtual {v4, v11}, Landroid/widget/LinearLayout;->setGravity(I)V
		 /* new-instance v5, Landroid/widget/LinearLayout$LayoutParams; */
		 /* mul-float v6, v0, v12 */
		 /* float-to-int v6, v6 */
		 /* mul-float/2addr v0, v12 */
		 /* float-to-int v0, v0 */
		 /* invoke-direct {v5, v6, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
		 (( android.widget.LinearLayout$LayoutParams ) v5 ).setMargins ( v9, v9, v1, v9 ); // invoke-virtual {v5, v9, v9, v1, v9}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
		 /* new-instance v0, Landroid/widget/ImageView; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 final String v6 = "heyzap_circle.png"; // const-string v6, "heyzap_circle.png"
		 com.heyzap.sdk.Drawables .setImageDrawable ( v1,v0,v6 );
		 (( android.widget.LinearLayout ) v4 ).addView ( v0, v5 ); // invoke-virtual {v4, v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v0, Landroid/widget/TextView; */
		 (( com.heyzap.sdk.PreMarketDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v5, 0x3f99999a # 1.2f */
		 (( android.widget.TextView ) v0 ).setLineSpacing ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V
		 (( android.widget.TextView ) v0 ).setTextColor ( v10 ); // invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTextColor(I)V
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "Install Heyzap to check-in to "; // const-string v5, "Install Heyzap to check-in to "
		 (( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v5 = this.gameName;
		 (( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v5 = ".Share games with friends, collect badges, and more! It\'s free and easy!"; // const-string v5, ".Share games with friends, collect badges, and more! It\'s free and easy!"
		 (( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 (( android.widget.LinearLayout ) v4 ).addView ( v0, v2 ); // invoke-virtual {v4, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 (( android.widget.LinearLayout ) v3 ).addView ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 } // .end method
