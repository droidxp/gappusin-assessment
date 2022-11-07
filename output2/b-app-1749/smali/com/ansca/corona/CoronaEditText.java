public class com.ansca.corona.CoronaEditText extends android.widget.EditText {
	 /* .source "CoronaEditText.java" */
	 /* # instance fields */
	 private Integer editingAfter;
	 private Integer editingBefore;
	 private Integer editingNumDeleted;
	 private Integer editingStart;
	 private Boolean isEditing;
	 private Boolean myClearingFocus;
	 private Integer myId;
	 private Boolean myIsPassword;
	 private android.text.method.TextKeyListener myKeyListener;
	 private Integer myTextColor;
	 private java.lang.String oldString;
	 /* # direct methods */
	 public com.ansca.corona.CoronaEditText ( ) {
		 /* .locals 3 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "id" # I */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V */
		 /* .line 25 */
		 /* iput-boolean v2, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
		 /* .line 26 */
		 /* iput v2, p0, Lcom/ansca/corona/CoronaEditText;->myTextColor:I */
		 /* .line 28 */
		 /* iput-boolean v2, p0, Lcom/ansca/corona/CoronaEditText;->myClearingFocus:Z */
		 /* .line 29 */
		 this.oldString = v0;
		 /* .line 30 */
		 /* iput v2, p0, Lcom/ansca/corona/CoronaEditText;->editingNumDeleted:I */
		 /* .line 31 */
		 /* iput v2, p0, Lcom/ansca/corona/CoronaEditText;->editingStart:I */
		 /* .line 32 */
		 /* iput v2, p0, Lcom/ansca/corona/CoronaEditText;->editingBefore:I */
		 /* .line 33 */
		 /* iput v2, p0, Lcom/ansca/corona/CoronaEditText;->editingAfter:I */
		 /* .line 34 */
		 /* iput-boolean v2, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
		 /* .line 35 */
		 this.myKeyListener = v0;
		 /* .line 40 */
		 /* iput p2, p0, Lcom/ansca/corona/CoronaEditText;->myId:I */
		 /* .line 42 */
		 /* new-instance v0, Lcom/ansca/corona/CoronaEditText$1; */
		 /* invoke-direct {v0, p0}, Lcom/ansca/corona/CoronaEditText$1;-><init>(Lcom/ansca/corona/CoronaEditText;)V */
		 (( com.ansca.corona.CoronaEditText ) p0 ).setOnFocusChangeListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
		 /* .line 56 */
		 /* new-instance v0, Lcom/ansca/corona/CoronaEditText$2; */
		 /* invoke-direct {v0, p0}, Lcom/ansca/corona/CoronaEditText$2;-><init>(Lcom/ansca/corona/CoronaEditText;)V */
		 (( com.ansca.corona.CoronaEditText ) p0 ).setOnEditorActionListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
		 /* .line 74 */
		 /* new-instance v0, Lcom/ansca/corona/CoronaEditText$3; */
		 /* invoke-direct {v0, p0}, Lcom/ansca/corona/CoronaEditText$3;-><init>(Lcom/ansca/corona/CoronaEditText;)V */
		 (( com.ansca.corona.CoronaEditText ) p0 ).addTextChangedListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V
		 /* .line 121 */
		 /* new-instance v0, Lcom/ansca/corona/CoronaEditText$4; */
		 v1 = android.text.method.TextKeyListener$Capitalize.NONE;
		 /* invoke-direct {v0, p0, v1, v2}, Lcom/ansca/corona/CoronaEditText$4;-><init>(Lcom/ansca/corona/CoronaEditText;Landroid/text/method/TextKeyListener$Capitalize;Z)V */
		 this.myKeyListener = v0;
		 /* .line 138 */
		 v0 = this.myKeyListener;
		 (( com.ansca.corona.CoronaEditText ) p0 ).setKeyListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setKeyListener(Landroid/text/method/KeyListener;)V
		 /* .line 140 */
		 android.text.method.SingleLineTransformationMethod .getInstance ( );
		 (( com.ansca.corona.CoronaEditText ) p0 ).setTransformationMethod ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
		 /* .line 141 */
		 return;
	 } // .end method
	 static Integer access$000 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget v0, p0, Lcom/ansca/corona/CoronaEditText;->myId:I */
	 } // .end method
	 static Boolean access$100 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
	 } // .end method
	 static Boolean access$102 ( com.ansca.corona.CoronaEditText p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # Z */
		 /* .prologue */
		 /* .line 23 */
		 /* iput-boolean p1, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
	 } // .end method
	 static java.lang.String access$200 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 v0 = this.oldString;
	 } // .end method
	 static java.lang.String access$202 ( com.ansca.corona.CoronaEditText p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 23 */
		 this.oldString = p1;
	 } // .end method
	 static Integer access$300 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget v0, p0, Lcom/ansca/corona/CoronaEditText;->editingNumDeleted:I */
	 } // .end method
	 static Integer access$302 ( com.ansca.corona.CoronaEditText p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/CoronaEditText;->editingNumDeleted:I */
	 } // .end method
	 static Integer access$400 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget v0, p0, Lcom/ansca/corona/CoronaEditText;->editingStart:I */
	 } // .end method
	 static Integer access$402 ( com.ansca.corona.CoronaEditText p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/CoronaEditText;->editingStart:I */
	 } // .end method
	 static Integer access$500 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget v0, p0, Lcom/ansca/corona/CoronaEditText;->editingAfter:I */
	 } // .end method
	 static Integer access$502 ( com.ansca.corona.CoronaEditText p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/CoronaEditText;->editingAfter:I */
	 } // .end method
	 static Integer access$602 ( com.ansca.corona.CoronaEditText p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/CoronaEditText;->editingBefore:I */
	 } // .end method
	 static Boolean access$700 ( com.ansca.corona.CoronaEditText p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CoronaEditText; */
		 /* .prologue */
		 /* .line 23 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
	 } // .end method
	 /* # virtual methods */
	 public void clearFocus ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 152 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->myClearingFocus:Z */
		 /* .line 154 */
		 /* invoke-super {p0}, Landroid/widget/EditText;->clearFocus()V */
		 /* .line 156 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->myClearingFocus:Z */
		 /* .line 157 */
		 return;
	 } // .end method
	 public void destroying ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 144 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/ansca/corona/CoronaEditText;->myId:I */
		 /* .line 145 */
		 return;
	 } // .end method
	 public java.lang.String getTextViewAlign ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 275 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 277 */
		 /* .local v0, "result":Ljava/lang/String; */
		 v1 = 		 (( com.ansca.corona.CoronaEditText ) p0 ).getGravity ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaEditText;->getGravity()I
		 /* packed-switch v1, :pswitch_data_0 */
		 /* .line 289 */
		 /* :pswitch_0 */
		 final String v0 = "unknown"; // const-string v0, "unknown"
		 /* .line 292 */
	 } // :goto_0
	 /* .line 280 */
	 /* :pswitch_1 */
	 final String v0 = "left"; // const-string v0, "left"
	 /* .line 281 */
	 /* .line 283 */
	 /* :pswitch_2 */
	 final String v0 = "right"; // const-string v0, "right"
	 /* .line 284 */
	 /* .line 286 */
	 /* :pswitch_3 */
	 final String v0 = "center"; // const-string v0, "center"
	 /* .line 287 */
	 /* .line 277 */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1 */
	 /* :pswitch_3 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_0 */
	 /* :pswitch_2 */
} // .end packed-switch
} // .end method
public Integer getTextViewColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 303 */
/* iget v0, p0, Lcom/ansca/corona/CoronaEditText;->myTextColor:I */
} // .end method
public java.lang.String getTextViewInputType ( ) {
/* .locals 4 */
/* .prologue */
/* .line 199 */
final String v2 = "unknown"; // const-string v2, "unknown"
/* .line 201 */
/* .local v2, "result":Ljava/lang/String; */
(( com.ansca.corona.CoronaEditText ) p0 ).getKeyListener ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaEditText;->getKeyListener()Landroid/text/method/KeyListener;
/* .line 202 */
/* .local v1, "listener":Landroid/text/method/KeyListener; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 v0 = 	 /* .line 204 */
	 /* .line 205 */
	 /* .local v0, "inputType":I */
	 /* and-int/lit8 v3, v0, 0xf */
	 /* packed-switch v3, :pswitch_data_0 */
	 /* .line 227 */
	 final String v2 = "default"; // const-string v2, "default"
	 /* .line 232 */
} // .end local v0 # "inputType":I
} // :cond_0
} // :goto_0
/* .line 208 */
/* .restart local v0 # "inputType":I */
/* :pswitch_0 */
final String v2 = "number"; // const-string v2, "number"
/* .line 209 */
/* .line 211 */
/* :pswitch_1 */
final String v2 = "phone"; // const-string v2, "phone"
/* .line 212 */
/* .line 214 */
/* :pswitch_2 */
/* and-int/lit16 v3, v0, 0xff0 */
/* sparse-switch v3, :sswitch_data_0 */
/* .line 222 */
final String v2 = "default"; // const-string v2, "default"
/* .line 223 */
/* .line 216 */
/* :sswitch_0 */
final String v2 = "url"; // const-string v2, "url"
/* .line 217 */
/* .line 219 */
/* :sswitch_1 */
final String v2 = "email"; // const-string v2, "email"
/* .line 220 */
/* .line 205 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
/* .line 214 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x10 -> :sswitch_0 */
/* 0x20 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public Boolean getTextViewPassword ( ) {
/* .locals 1 */
/* .prologue */
/* .line 251 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
} // .end method
public Float getTextViewSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 313 */
v0 = (( com.ansca.corona.CoronaEditText ) p0 ).getTextSize ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaEditText;->getTextSize()F
} // .end method
public Boolean isReadOnly ( ) {
/* .locals 1 */
/* .prologue */
/* .line 338 */
(( com.ansca.corona.CoronaEditText ) p0 ).getKeyListener ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaEditText;->getKeyListener()Landroid/text/method/KeyListener;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean requestFocus ( Integer p0, android.graphics.Rect p1 ) {
/* .locals 1 */
/* .param p1, "direction" # I */
/* .param p2, "previouslyFocusedRect" # Landroid/graphics/Rect; */
/* .prologue */
/* .line 164 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->myClearingFocus:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 165 */
int v0 = 0; // const/4 v0, 0x0
/* .line 167 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/widget/EditText;->requestFocus(ILandroid/graphics/Rect;)Z */
} // .end method
public void setReadOnly ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "value" # Z */
/* .prologue */
/* .line 334 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
(( com.ansca.corona.CoronaEditText ) p0 ).setKeyListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setKeyListener(Landroid/text/method/KeyListener;)V
/* .line 335 */
return;
/* .line 334 */
} // :cond_0
v0 = this.myKeyListener;
} // .end method
public void setText ( java.lang.CharSequence p0, android.widget.TextView$BufferType p1 ) {
/* .locals 2 */
/* .param p1, "text" # Ljava/lang/CharSequence; */
/* .param p2, "type" # Landroid/widget/TextView$BufferType; */
/* .prologue */
/* .line 327 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
/* .line 328 */
/* .local v0, "savedEditing":Z */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
/* .line 329 */
/* invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V */
/* .line 330 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaEditText;->isEditing:Z */
/* .line 331 */
return;
} // .end method
public void setTextViewAlign ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "align" # Ljava/lang/String; */
/* .prologue */
/* .line 256 */
int v0 = 3; // const/4 v0, 0x3
/* .line 258 */
/* .local v0, "gravity":I */
final String v1 = "left"; // const-string v1, "left"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 260 */
int v0 = 3; // const/4 v0, 0x3
/* .line 270 */
} // :cond_0
} // :goto_0
(( com.ansca.corona.CoronaEditText ) p0 ).setGravity ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setGravity(I)V
/* .line 271 */
return;
/* .line 262 */
} // :cond_1
final String v1 = "center"; // const-string v1, "center"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 264 */
int v0 = 1; // const/4 v0, 0x1
/* .line 266 */
} // :cond_2
final String v1 = "right"; // const-string v1, "right"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 268 */
int v0 = 5; // const/4 v0, 0x5
} // .end method
public void setTextViewColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "color" # I */
/* .prologue */
/* .line 297 */
/* iput p1, p0, Lcom/ansca/corona/CoronaEditText;->myTextColor:I */
/* .line 298 */
(( com.ansca.corona.CoronaEditText ) p0 ).setTextColor ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/CoronaEditText;->setTextColor(I)V
/* .line 299 */
return;
} // .end method
public void setTextViewFont ( java.lang.String p0, Float p1, com.ansca.corona.CoronaActivity p2 ) {
/* .locals 3 */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 318 */
com.ansca.corona.CoronaText .getTypeface ( p1,p3 );
/* .line 319 */
/* .local v1, "typeface":Landroid/graphics/Typeface; */
int v0 = 0; // const/4 v0, 0x0
/* .line 321 */
/* .local v0, "style":I */
(( com.ansca.corona.CoronaEditText ) p0 ).setTypeface ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/ansca/corona/CoronaEditText;->setTypeface(Landroid/graphics/Typeface;I)V
/* .line 322 */
int v2 = 1; // const/4 v2, 0x1
(( com.ansca.corona.CoronaEditText ) p0 ).setTextSize ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Lcom/ansca/corona/CoronaEditText;->setTextSize(IF)V
/* .line 323 */
return;
} // .end method
public void setTextViewInputType ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "inputType" # Ljava/lang/String; */
/* .prologue */
/* .line 172 */
int v0 = 0; // const/4 v0, 0x0
/* .line 174 */
/* .local v0, "type":I */
final String v1 = "number"; // const-string v1, "number"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 175 */
int v0 = 2; // const/4 v0, 0x2
/* .line 188 */
} // :cond_0
} // :goto_0
/* iget-boolean v1, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 189 */
/* or-int/lit16 v0, v0, 0x80 */
/* .line 191 */
} // :cond_1
v1 = com.ansca.corona.Controller .getAndroidVersionSpecific ( );
/* or-int/2addr v0, v1 */
/* .line 193 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 194 */
(( com.ansca.corona.CoronaEditText ) p0 ).setInputType ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setInputType(I)V
/* .line 195 */
} // :cond_2
return;
/* .line 176 */
} // :cond_3
final String v1 = "phone"; // const-string v1, "phone"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 177 */
int v0 = 3; // const/4 v0, 0x3
/* .line 178 */
} // :cond_4
final String v1 = "url"; // const-string v1, "url"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 179 */
/* const/16 v0, 0x11 */
/* .line 180 */
} // :cond_5
final String v1 = "email"; // const-string v1, "email"
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 181 */
/* const/16 v0, 0x21 */
/* .line 183 */
} // :cond_6
int v0 = 1; // const/4 v0, 0x1
/* .line 184 */
/* iget-boolean v1, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
/* if-nez v1, :cond_0 */
/* .line 185 */
/* or-int/lit8 v0, v0, 0x0 */
} // .end method
public void setTextViewPassword ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "isPassword" # Z */
/* .prologue */
/* .line 239 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 240 */
android.text.method.PasswordTransformationMethod .getInstance ( );
/* .line 244 */
/* .local v0, "method":Landroid/text/method/TransformationMethod; */
} // :goto_0
(( com.ansca.corona.CoronaEditText ) p0 ).setTransformationMethod ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaEditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
/* .line 246 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaEditText;->myIsPassword:Z */
/* .line 247 */
return;
/* .line 242 */
} // .end local v0 # "method":Landroid/text/method/TransformationMethod;
} // :cond_0
android.text.method.SingleLineTransformationMethod .getInstance ( );
/* .restart local v0 # "method":Landroid/text/method/TransformationMethod; */
} // .end method
public void setTextViewSize ( Float p0 ) {
/* .locals 1 */
/* .param p1, "fontSize" # F */
/* .prologue */
/* .line 308 */
int v0 = 1; // const/4 v0, 0x1
(( com.ansca.corona.CoronaEditText ) p0 ).setTextSize ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/ansca/corona/CoronaEditText;->setTextSize(IF)V
/* .line 309 */
return;
} // .end method
