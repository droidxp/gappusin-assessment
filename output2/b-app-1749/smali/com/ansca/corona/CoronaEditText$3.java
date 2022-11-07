class com.ansca.corona.CoronaEditText$3 implements android.text.TextWatcher {
	 /* .source "CoronaEditText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaEditText;-><init>(Landroid/content/Context;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaEditText this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaEditText$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 74 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void afterTextChanged ( android.text.Editable p0 ) {
/* .locals 8 */
/* .param p1, "text" # Landroid/text/Editable; */
/* .prologue */
/* .line 87 */
v0 = this.this$0;
v0 = com.ansca.corona.CoronaEditText .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.this$0;
		 v0 = 		 com.ansca.corona.CoronaEditText .access$000 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 89 */
			 int v6 = 0; // const/4 v6, 0x0
			 /* .line 91 */
			 /* .local v6, "newstring":Ljava/lang/String; */
			 int v7 = 0; // const/4 v7, 0x0
			 /* .line 92 */
			 /* .local v7, "numDeleted":I */
			 int v4 = 0; // const/4 v4, 0x0
			 /* .line 94 */
			 /* .local v4, "newchars":Ljava/lang/String; */
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 96 */
				 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
				 /* .line 97 */
				 v0 = this.this$0;
				 v0 = 				 com.ansca.corona.CoronaEditText .access$400 ( v0 );
				 v1 = this.this$0;
				 v1 = 				 com.ansca.corona.CoronaEditText .access$400 ( v1 );
				 v2 = this.this$0;
				 v2 = 				 com.ansca.corona.CoronaEditText .access$500 ( v2 );
				 /* add-int/2addr v1, v2 */
				 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
				 /* .line 100 */
			 } // :cond_0
			 com.ansca.corona.Controller .getEventManager ( );
			 v1 = this.this$0;
			 v1 = 			 com.ansca.corona.CoronaEditText .access$000 ( v1 );
			 v2 = this.this$0;
			 v2 = 			 com.ansca.corona.CoronaEditText .access$400 ( v2 );
			 v3 = this.this$0;
			 v3 = 			 com.ansca.corona.CoronaEditText .access$300 ( v3 );
			 v5 = this.this$0;
			 com.ansca.corona.CoronaEditText .access$200 ( v5 );
			 /* invoke-virtual/range {v0 ..v6}, Lcom/ansca/corona/events/EventManager;->textEditingEvent(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 102 */
		 } // .end local v4 # "newchars":Ljava/lang/String;
	 } // .end local v6 # "newstring":Ljava/lang/String;
} // .end local v7 # "numDeleted":I
} // :cond_1
return;
} // .end method
public void beforeTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p1, "text" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "count" # I */
/* .param p4, "after" # I */
/* .prologue */
/* .line 78 */
v0 = this.this$0;
v0 = com.ansca.corona.CoronaEditText .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
v0 = this.this$0;
/* new-instance v1, Ljava/lang/String; */
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
com.ansca.corona.CoronaEditText .access$202 ( v0,v1 );
/* .line 81 */
v0 = this.this$0;
com.ansca.corona.CoronaEditText .access$302 ( v0,p3 );
/* .line 83 */
} // :cond_0
return;
} // .end method
public void onTextChanged ( java.lang.CharSequence p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/CharSequence; */
/* .param p2, "start" # I */
/* .param p3, "before" # I */
/* .param p4, "after" # I */
/* .prologue */
/* .line 107 */
v0 = this.this$0;
v0 = com.ansca.corona.CoronaEditText .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 112 */
v0 = this.this$0;
com.ansca.corona.CoronaEditText .access$402 ( v0,p2 );
/* .line 113 */
v0 = this.this$0;
com.ansca.corona.CoronaEditText .access$602 ( v0,p3 );
/* .line 114 */
v0 = this.this$0;
com.ansca.corona.CoronaEditText .access$502 ( v0,p4 );
/* .line 117 */
} // :cond_0
return;
} // .end method
