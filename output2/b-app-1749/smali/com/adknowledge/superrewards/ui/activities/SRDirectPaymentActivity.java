public class com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity extends android.app.Activity {
	 /* .source "SRDirectPaymentActivity.java" */
	 /* # instance fields */
	 private com.adknowledge.superrewards.model.SROffer directPaymentMethod;
	 private android.widget.ImageView imageView;
	 private android.widget.Spinner spinner;
	 private android.widget.TextView textButton;
	 private android.widget.TextView textView;
	 private android.widget.TextView textView2;
	 /* # direct methods */
	 public com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static android.widget.Spinner access$000 ( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity; */
		 /* .prologue */
		 /* .line 37 */
		 v0 = this.spinner;
	 } // .end method
	 static com.adknowledge.superrewards.model.SROffer access$100 ( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity; */
		 /* .prologue */
		 /* .line 37 */
		 v0 = this.directPaymentMethod;
	 } // .end method
	 private android.view.View$OnClickListener getBuyButtonOnCLickListener ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 87 */
		 /* new-instance v0, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity$1; */
		 /* invoke-direct {v0, p0}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity$1;-><init>(Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;)V */
	 } // .end method
	 /* # virtual methods */
	 public void customTitleBar ( java.lang.String p0, Boolean p1, java.lang.Boolean p2 ) {
		 /* .locals 5 */
		 /* .param p1, "blurb" # Ljava/lang/String; */
		 /* .param p2, "spinner" # Z */
		 /* .param p3, "customTitleSupported" # Ljava/lang/Boolean; */
		 /* .prologue */
		 /* .line 114 */
		 v2 = 		 (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 115 */
			 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getWindow()Landroid/view/Window;
			 int v3 = 7; // const/4 v3, 0x7
			 (( android.view.Window ) v2 ).setFeatureInt ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setFeatureInt(II)V
			 /* .line 116 */
			 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 /* .line 117 */
			 /* .local v0, "SRCustomTitleLeft":Landroid/widget/TextView; */
			 (( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 /* .line 119 */
			 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v1, Landroid/widget/ProgressBar; */
			 /* .line 121 */
			 /* .local v1, "titleProgressBar":Landroid/widget/ProgressBar; */
			 /* const/16 v2, 0x8 */
			 (( android.widget.ProgressBar ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
			 /* .line 122 */
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 123 */
				 final String v2 = "Loading..."; // const-string v2, "Loading..."
				 (( android.widget.TextView ) v0 ).setText ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
				 /* .line 124 */
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.widget.ProgressBar ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
				 /* .line 127 */
			 } // .end local v0 # "SRCustomTitleLeft":Landroid/widget/TextView;
		 } // .end local v1 # "titleProgressBar":Landroid/widget/ProgressBar;
	 } // :cond_0
	 return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 9 */
	 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
	 /* .prologue */
	 /* .line 48 */
	 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
	 /* .line 49 */
	 int v5 = 7; // const/4 v5, 0x7
	 v1 = 	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).requestWindowFeature ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->requestWindowFeature(I)Z
	 /* .line 50 */
	 /* .local v1, "customTitleSupported":Z */
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).setContentView ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->setContentView(I)V
	 /* .line 52 */
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getIntent()Landroid/content/Intent;
	 final String v6 = "offer"; // const-string v6, "offer"
	 (( android.content.Intent ) v5 ).getSerializableExtra ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
	 /* check-cast v5, Lcom/adknowledge/superrewards/model/SROffer; */
	 this.directPaymentMethod = v5;
	 /* .line 54 */
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
	 /* check-cast v5, Landroid/widget/TextView; */
	 this.textView = v5;
	 /* .line 56 */
	 v5 = this.textView;
	 v6 = this.directPaymentMethod;
	 (( com.adknowledge.superrewards.model.SROffer ) v6 ).getName ( ); // invoke-virtual {v6}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
	 (( java.lang.String ) v6 ).trim ( ); // invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
	 (( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 (( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 58 */
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
	 /* check-cast v5, Landroid/widget/ImageView; */
	 this.imageView = v5;
	 /* .line 60 */
	 (( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
	 /* check-cast v5, Landroid/widget/Spinner; */
	 this.spinner = v5;
	 /* .line 62 */
	 /* new-instance v0, Landroid/widget/ArrayAdapter; */
	 /* const v5, 0x1090008 */
	 /* invoke-direct {v0, p0, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V */
	 /* .line 63 */
	 /* .local v0, "arrayAdapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;" */
	 /* const v5, 0x1090009 */
	 (( android.widget.ArrayAdapter ) v0 ).setDropDownViewResource ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V
	 /* .line 64 */
	 v5 = this.spinner;
	 (( android.widget.Spinner ) v5 ).setAdapter ( v0 ); // invoke-virtual {v5, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V
	 /* .line 66 */
	 v5 = this.directPaymentMethod;
	 (( com.adknowledge.superrewards.model.SROffer ) v5 ).getPricePoints ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getPricePoints()Ljava/util/List;
	 /* .local v3, "i$":Ljava/util/Iterator; */
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_0
	 /* check-cast v4, Lcom/adknowledge/superrewards/model/SRPricePoint; */
	 /* .line 67 */
	 /* .local v4, "point":Lcom/adknowledge/superrewards/model/SRPricePoint; */
	 (( com.adknowledge.superrewards.model.SRPricePoint ) v4 ).getLocalText ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getLocalText()Ljava/lang/String;
	 (( android.widget.ArrayAdapter ) v0 ).add ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V
	 /* .line 70 */
} // .end local v4 # "point":Lcom/adknowledge/superrewards/model/SRPricePoint;
} // :cond_0
(( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/TextView; */
this.textView2 = v5;
/* .line 71 */
v5 = this.textView2;
v6 = this.directPaymentMethod;
(( com.adknowledge.superrewards.model.SROffer ) v6 ).getDescription ( ); // invoke-virtual {v6}, Lcom/adknowledge/superrewards/model/SROffer;->getDescription()Ljava/lang/String;
(( java.lang.String ) v6 ).trim ( ); // invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v7 = "%points%"; // const-string v7, "%points%"
v8 = com.adknowledge.superrewards.model.SRParams.currency;
(( java.lang.String ) v8 ).trim ( ); // invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v8 ).toLowerCase ( ); // invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v6 ).replace ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v7 = "%POINTS%"; // const-string v7, "%POINTS%"
v8 = com.adknowledge.superrewards.model.SRParams.currency;
(( java.lang.String ) v8 ).trim ( ); // invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v8 ).toLowerCase ( ); // invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v6 ).replace ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 74 */
v5 = this.directPaymentMethod;
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getName ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
v5 = com.adknowledge.superrewards.model.SRImageByName .getDirectPayImageByName ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 75 */
(( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getResources()Landroid/content/res/Resources;
v6 = this.directPaymentMethod;
(( com.adknowledge.superrewards.model.SROffer ) v6 ).getName ( ); // invoke-virtual {v6}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
v6 = com.adknowledge.superrewards.model.SRImageByName .getDirectPayImageByName ( v6 );
(( android.content.res.Resources ) v5 ).getDrawable ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 76 */
/* .local v2, "drawable":Landroid/graphics/drawable/Drawable; */
v5 = this.imageView;
(( android.widget.ImageView ) v5 ).setImageDrawable ( v2 ); // invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 79 */
} // .end local v2 # "drawable":Landroid/graphics/drawable/Drawable;
} // :cond_1
(( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).findViewById ( v5 ); // invoke-virtual {p0, v5}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/TextView; */
this.textButton = v5;
/* .line 80 */
v5 = this.textButton;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "buy "; // const-string v7, "buy "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = com.adknowledge.superrewards.model.SRParams.currency;
(( java.lang.String ) v7 ).trim ( ); // invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v7 ).toLowerCase ( ); // invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 81 */
v5 = this.textButton;
/* invoke-direct {p0}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->getBuyButtonOnCLickListener()Landroid/view/View$OnClickListener; */
(( android.widget.TextView ) v5 ).setOnClickListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 82 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "buy more "; // const-string v6, "buy more "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = com.adknowledge.superrewards.model.SRParams.currency;
(( java.lang.String ) v6 ).trim ( ); // invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v6 = 0; // const/4 v6, 0x0
java.lang.Boolean .valueOf ( v1 );
(( com.adknowledge.superrewards.ui.activities.SRDirectPaymentActivity ) p0 ).customTitleBar ( v5, v6, v7 ); // invoke-virtual {p0, v5, v6, v7}, Lcom/adknowledge/superrewards/ui/activities/SRDirectPaymentActivity;->customTitleBar(Ljava/lang/String;ZLjava/lang/Boolean;)V
/* .line 84 */
return;
} // .end method
