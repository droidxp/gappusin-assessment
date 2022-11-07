public class inal {
	 /* # instance fields */
	 private com.doodlemobile.basket.b.b a;
	 private com.doodlemobile.basket.ui.c b;
	 /* # direct methods */
	 private inal ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.b = v0;
		 this.a = p1;
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/g;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 this.b = p2;
		 return;
	 } // .end method
	 private com.doodlemobile.basket.ui.e a ( java.lang.String p0, android.util.AttributeSet p1 ) {
		 /* .locals 5 */
		 int v2 = 0; // const/4 v2, 0x0
		 final String v1 = "View"; // const-string v1, "View"
		 final String v0 = "View"; // const-string v0, "View"
		 v0 = 		 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_f
			 final String v0 = "class"; // const-string v0, "class"
		 } // :goto_0
		 try { // :try_start_0
			 v1 = this.b;
			 /* if-nez v1, :cond_0 */
			 /* move-object v1, v2 */
		 } // :goto_1
		 /* if-nez v1, :cond_e */
		 v1 = this.a;
		 final String v2 = "Layout"; // const-string v2, "Layout"
		 v2 = 		 (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* new-instance v2, Lcom/doodlemobile/basket/ui/UILayout; */
			 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/UILayout;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
			 /* move-object v0, v2 */
		 } // :goto_2
	 } // :cond_0
	 v1 = this.b;
	 v2 = this.a;
} // :cond_1
final String v2 = "Animation"; // const-string v2, "Animation"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/AnimationView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/AnimationView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_2
final String v2 = "Image"; // const-string v2, "Image"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/ImageView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/ImageView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_3
final String v2 = "Text"; // const-string v2, "Text"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/TextView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/TextView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_4
final String v2 = "Panel"; // const-string v2, "Panel"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/Panel; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/Panel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_5
final String v2 = "Button"; // const-string v2, "Button"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/Button; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/Button;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_6
final String v2 = "View"; // const-string v2, "View"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/e; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_7
final String v2 = "scrollview"; // const-string v2, "scrollview"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_8
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/ScrollView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/ScrollView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
} // :cond_8
final String v2 = "progressbar"; // const-string v2, "progressbar"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_9
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/ProgressBarView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/ProgressBarView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
	 /* goto/16 :goto_2 */
} // :cond_9
final String v2 = "HorizontalScrollView"; // const-string v2, "HorizontalScrollView"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_a
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/HorizontalScrollView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
	 /* goto/16 :goto_2 */
} // :cond_a
final String v2 = "ITextView"; // const-string v2, "ITextView"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_b
	 /* new-instance v2, Lcom/doodlemobile/basket/font/ITextView; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/font/ITextView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
	 /* goto/16 :goto_2 */
} // :cond_b
final String v2 = "EditText"; // const-string v2, "EditText"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_c
	 /* new-instance v2, Lcom/doodlemobile/basket/test/EditText; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/test/EditText;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
	 /* goto/16 :goto_2 */
} // :cond_c
final String v2 = "MaskPanel"; // const-string v2, "MaskPanel"
v2 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_d
	 /* new-instance v2, Lcom/doodlemobile/basket/ui/MaskPanel; */
	 /* invoke-direct {v2, v1, p2}, Lcom/doodlemobile/basket/ui/MaskPanel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
	 /* move-object v0, v2 */
	 /* goto/16 :goto_2 */
} // :cond_d
/* new-instance v1, Landroid/view/InflateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = " not defined."; // const-string v3, " not defined."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catch Landroid/view/InflateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
/* throw v0 */
/* :catch_1 */
/* move-exception v1 */
/* new-instance v2, Landroid/view/InflateException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ": Error inflating class "; // const-string v4, ": Error inflating class "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
(( android.view.InflateException ) v2 ).initCause ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw v2 */
} // :cond_e
/* move-object v0, v1 */
/* goto/16 :goto_2 */
} // :cond_f
/* move-object v0, p1 */
/* goto/16 :goto_0 */
} // .end method
private void a ( org.xmlpull.v1.XmlPullParser p0, Object p1, android.util.AttributeSet p2 ) {
v2 = /* .locals 5 */
} // :cond_0
v1 = } // :goto_0
int v3 = 3; // const/4 v3, 0x3
v3 = /* if-ne v1, v3, :cond_1 */
/* if-le v3, v2, :cond_3 */
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
/* if-eq v1, v3, :cond_3 */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v1, v3, :cond_0 */
final String v3 = "Include"; // const-string v3, "Include"
v3 = (( java.lang.String ) v3 ).equals ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
v1 = if ( v3 != null) { // if-eqz v3, :cond_2
/* if-nez v1, :cond_0 */
/* new-instance v1, Landroid/view/InflateException; */
final String v2 = "<include /> cannot be the root element"; // const-string v2, "<include /> cannot be the root element"
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_2
/* invoke-direct {p0, v1, p3}, Lcom/doodlemobile/basket/ui/g;->a(Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/doodlemobile/basket/ui/e; */
/* move-object v0, p2 */
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
/* move-object v1, v0 */
/* new-instance v4, Lcom/doodlemobile/basket/ui/b; */
/* invoke-direct {v4, p3}, Lcom/doodlemobile/basket/ui/b;-><init>(Landroid/util/AttributeSet;)V */
this.c = v4;
/* invoke-direct {p0, p1, v3, p3}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;Lcom/doodlemobile/basket/ui/e;Landroid/util/AttributeSet;)V */
(( com.doodlemobile.basket.ui.UIViewGroup ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(Lcom/doodlemobile/basket/ui/e;)V
} // :cond_3
return;
} // .end method
/* # virtual methods */
public final com.doodlemobile.basket.ui.e a ( org.xmlpull.v1.XmlPullParser p0 ) {
/* .locals 4 */
int v3 = 2; // const/4 v3, 0x2
android.util.Xml .asAttributeSet ( p1 );
} // :cond_0
v1 = try { // :try_start_0
/* if-eq v1, v3, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
} // :cond_1
/* if-eq v1, v3, :cond_2 */
/* new-instance v0, Landroid/view/InflateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ": No start tag found!"; // const-string v2, ": No start tag found!"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
(( org.xmlpull.v1.XmlPullParserException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
(( android.view.InflateException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw v1 */
} // :cond_2
try { // :try_start_1
/* invoke-direct {p0, v1, v0}, Lcom/doodlemobile/basket/ui/g;->a(Ljava/lang/String;Landroid/util/AttributeSet;)Lcom/doodlemobile/basket/ui/e; */
/* invoke-direct {p0, p1, v1, v0}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;Lcom/doodlemobile/basket/ui/e;Landroid/util/AttributeSet;)V */
/* :try_end_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* new-instance v1, Landroid/view/InflateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ": "; // const-string v3, ": "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V */
(( android.view.InflateException ) v1 ).initCause ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/InflateException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw v1 */
} // .end method
