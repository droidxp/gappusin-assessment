public class com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity extends android.app.Activity {
	 /* .source "SROfferPaymentActivity.java" */
	 /* # instance fields */
	 private com.adknowledge.superrewards.model.SROffer offer;
	 private android.widget.TextView textButton;
	 private android.widget.TextView textView;
	 private android.widget.TextView textView2;
	 private android.widget.TextView textView3;
	 /* # direct methods */
	 public com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static com.adknowledge.superrewards.model.SROffer access$000 ( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity; */
		 /* .prologue */
		 /* .line 33 */
		 v0 = this.offer;
	 } // .end method
	 private android.view.View$OnClickListener getBuyButtonOnCLickListener ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 69 */
		 /* new-instance v0, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity$1; */
		 /* invoke-direct {v0, p0}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity$1;-><init>(Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;)V */
	 } // .end method
	 /* # virtual methods */
	 public void customTitleBar ( java.lang.String p0, java.lang.Boolean p1 ) {
		 /* .locals 5 */
		 /* .param p1, "blurb" # Ljava/lang/String; */
		 /* .param p2, "customTitleSupported" # Ljava/lang/Boolean; */
		 /* .prologue */
		 /* .line 90 */
		 v2 = 		 (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 91 */
			 (( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getWindow()Landroid/view/Window;
			 int v3 = 7; // const/4 v3, 0x7
			 (( android.view.Window ) v2 ).setFeatureInt ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setFeatureInt(II)V
			 /* .line 92 */
			 (( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 /* .line 93 */
			 /* .local v0, "SRCustomTitleLeft":Landroid/widget/TextView; */
			 (( android.widget.TextView ) v0 ).setText ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 /* .line 95 */
			 (( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
			 /* check-cast v1, Landroid/widget/ProgressBar; */
			 /* .line 97 */
			 /* .local v1, "titleProgressBar":Landroid/widget/ProgressBar; */
			 /* const/16 v2, 0x8 */
			 (( android.widget.ProgressBar ) v1 ).setVisibility ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V
			 /* .line 99 */
		 } // .end local v0 # "SRCustomTitleLeft":Landroid/widget/TextView;
	 } // .end local v1 # "titleProgressBar":Landroid/widget/ProgressBar;
} // :cond_0
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 43 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 44 */
int v2 = 7; // const/4 v2, 0x7
v0 = (( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).requestWindowFeature ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->requestWindowFeature(I)Z
/* .line 45 */
/* .local v0, "customTitleSupported":Z */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).setContentView ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->setContentView(I)V
/* .line 47 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getIntent()Landroid/content/Intent;
final String v3 = "offer"; // const-string v3, "offer"
(( android.content.Intent ) v2 ).getSerializableExtra ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast v2, Lcom/adknowledge/superrewards/model/SROffer; */
this.offer = v2;
/* .line 48 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ImageView; */
/* .line 49 */
/* .local v1, "srImageView":Landroid/widget/ImageView; */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getApplicationContext()Landroid/content/Context;
v3 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getImage ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getImage()Ljava/lang/String;
com.adknowledge.superrewards.Utils .getImage ( v2,v3 );
(( android.widget.ImageView ) v1 ).setImageDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 51 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
this.textView = v2;
/* .line 52 */
v2 = this.textView;
v3 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getName ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getName()Ljava/lang/String;
(( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 54 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
this.textView2 = v2;
/* .line 55 */
v2 = this.textView2;
v3 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getDescription ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getDescription()Ljava/lang/String;
final String v4 = "%points%"; // const-string v4, "%points%"
v5 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getCurrency ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v5 ).toLowerCase ( ); // invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v4 = "%POINTS%"; // const-string v4, "%POINTS%"
v5 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getCurrency ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v5 ).toLowerCase ( ); // invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 57 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
this.textView3 = v2;
/* .line 58 */
v2 = this.textView3;
v3 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getRequirements ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getRequirements()Ljava/lang/String;
final String v4 = "%points%"; // const-string v4, "%points%"
v5 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getCurrency ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v5 ).toLowerCase ( ); // invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v4 = "%POINTS%"; // const-string v4, "%POINTS%"
v5 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v5 ).getCurrency ( ); // invoke-virtual {v5}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v5 ).toLowerCase ( ); // invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v3 ).replace ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 60 */
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).findViewById ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
this.textButton = v2;
/* .line 61 */
v2 = this.textButton;
final String v3 = "<small>complete the offer now for<br/></small>"; // const-string v3, "<small>complete the offer now for<br/></small>"
android.text.Html .fromHtml ( v3 );
(( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 62 */
v2 = this.textButton;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "<big>"; // const-string v4, "<big>"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v4 ).getPayout ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/model/SROffer;->getPayout()Ljava/lang/String;
(( java.lang.String ) v4 ).toLowerCase ( ); // invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " "; // const-string v4, " "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v4 ).getCurrency ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v4 ).toLowerCase ( ); // invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "</big>"; // const-string v4, "</big>"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.text.Html .fromHtml ( v3 );
(( android.widget.TextView ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V
/* .line 64 */
v2 = this.textButton;
/* invoke-direct {p0}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->getBuyButtonOnCLickListener()Landroid/view/View$OnClickListener; */
(( android.widget.TextView ) v2 ).setOnClickListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 65 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "earn more "; // const-string v3, "earn more "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.offer;
(( com.adknowledge.superrewards.model.SROffer ) v3 ).getCurrency ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/model/SROffer;->getCurrency()Ljava/lang/String;
(( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.lang.Boolean .valueOf ( v0 );
(( com.adknowledge.superrewards.ui.activities.SROfferPaymentActivity ) p0 ).customTitleBar ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/adknowledge/superrewards/ui/activities/SROfferPaymentActivity;->customTitleBar(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 66 */
return;
} // .end method
