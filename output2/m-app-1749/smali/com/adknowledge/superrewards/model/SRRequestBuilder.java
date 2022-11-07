public class com.adknowledge.superrewards.model.SRRequestBuilder {
	 /* .source "SRRequestBuilder.java" */
	 /* # instance fields */
	 android.content.Context ctx;
	 java.lang.String pattern;
	 com.adknowledge.superrewards.model.SROffer zongoffer;
	 /* # direct methods */
	 public com.adknowledge.superrewards.model.SRRequestBuilder ( ) {
		 /* .locals 1 */
		 /* .param p1, "ctx" # Landroid/content/Context; */
		 /* .param p2, "zongoffer" # Lcom/adknowledge/superrewards/model/SROffer; */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 final String v0 = "?purchaseKey="; // const-string v0, "?purchaseKey="
		 this.pattern = v0;
		 /* .line 22 */
		 this.ctx = p1;
		 /* .line 23 */
		 this.zongoffer = p2;
		 /* .line 24 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.zong.android.engine.activities.ZongPaymentRequest getRequest ( ) {
		 /* .locals 20 */
		 /* .prologue */
		 /* .line 27 */
		 int v11 = 1; // const/4 v11, 0x1
		 /* .line 29 */
		 /* .local v11, "onRealPhone":Z */
		 com.zong.android.engine.provider.ZongPhoneManager .getInstance ( );
		 /* move-object/from16 v0, p0 */
		 v5 = this.ctx;
		 (( com.zong.android.engine.provider.ZongPhoneManager ) v4 ).getPhoneState ( v5 ); // invoke-virtual {v4, v5}, Lcom/zong/android/engine/provider/ZongPhoneManager;->getPhoneState(Landroid/content/Context;)Lcom/zong/android/engine/provider/PhoneState;
		 com.adknowledge.superrewards.Utils .getCountryCode ( );
		 (( com.zong.android.engine.provider.PhoneState ) v4 ).getMsisdn ( v5 ); // invoke-virtual {v4, v5}, Lcom/zong/android/engine/provider/PhoneState;->getMsisdn(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 30 */
		 /* .local v12, "phoneNumber":Ljava/lang/String; */
		 com.zong.android.engine.provider.ZongPhoneManager .getInstance ( );
		 /* move-object/from16 v0, p0 */
		 v5 = this.ctx;
		 (( com.zong.android.engine.provider.ZongPhoneManager ) v4 ).getPhoneState ( v5 ); // invoke-virtual {v4, v5}, Lcom/zong/android/engine/provider/ZongPhoneManager;->getPhoneState(Landroid/content/Context;)Lcom/zong/android/engine/provider/PhoneState;
		 (( com.zong.android.engine.provider.PhoneState ) v4 ).getSimOp ( ); // invoke-virtual {v4}, Lcom/zong/android/engine/provider/PhoneState;->getSimOp()Ljava/lang/String;
		 /* .line 31 */
		 /* .local v16, "simOperator":Ljava/lang/String; */
		 /* new-instance v1, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
		 /* invoke-direct {v1}, Lcom/zong/android/engine/activities/ZongPaymentRequest;-><init>()V */
		 /* .line 32 */
		 /* .local v1, "paymentRequest":Lcom/zong/android/engine/activities/ZongPaymentRequest; */
		 int v4 = 0; // const/4 v4, 0x0
		 java.lang.Boolean .valueOf ( v4 );
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setDebugMode ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setDebugMode(Ljava/lang/Boolean;)V
		 /* .line 33 */
		 if ( v11 != null) { // if-eqz v11, :cond_0
			 int v4 = 0; // const/4 v4, 0x0
		 } // :goto_0
		 java.lang.Boolean .valueOf ( v4 );
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setSimulationMode ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setSimulationMode(Ljava/lang/Boolean;)V
		 /* .line 34 */
		 final String v4 = "Test"; // const-string v4, "Test"
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setAppName ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setAppName(Ljava/lang/String;)V
		 /* .line 35 */
		 final String v4 = "en"; // const-string v4, "en"
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setLang ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setLang(Ljava/lang/String;)V
		 /* .line 36 */
		 com.adknowledge.superrewards.Utils .getCountryCode ( );
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setCountry ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setCountry(Ljava/lang/String;)V
		 /* .line 37 */
		 final String v4 = "USD"; // const-string v4, "USD"
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setCurrency ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setCurrency(Ljava/lang/String;)V
		 /* .line 38 */
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setPhoneNumber ( v12 ); // invoke-virtual {v1, v12}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setPhoneNumber(Ljava/lang/String;)V
		 /* .line 39 */
		 /* move-object/from16 v0, v16 */
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setMno ( v0 ); // invoke-virtual {v1, v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setMno(Ljava/lang/String;)V
		 /* .line 40 */
		 final String v4 = "https://pay01.zong.com/zongpay/actions/processing"; // const-string v4, "https://pay01.zong.com/zongpay/actions/processing"
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setUrl ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setUrl(Ljava/lang/String;)V
		 /* .line 43 */
		 com.adknowledge.superrewards.web.SRClient .getInstance ( );
		 (( com.adknowledge.superrewards.web.SRClient ) v4 ).createRequest ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
		 /* .line 44 */
		 /* .local v14, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
		 v4 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).setCommand ( v4 ); // invoke-virtual {v14, v4}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
		 /* .line 45 */
		 v4 = com.adknowledge.superrewards.web.SRRequest$Call.GET_SUB;
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).setCall ( v4 ); // invoke-virtual {v14, v4}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
		 /* .line 46 */
		 final String v4 = "offer"; // const-string v4, "offer"
		 final String v5 = "3851"; // const-string v5, "3851"
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).addInnerParam ( v4, v5 ); // invoke-virtual {v14, v4, v5}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 47 */
		 final String v4 = "uid"; // const-string v4, "uid"
		 v5 = com.adknowledge.superrewards.web.SRClient.uid;
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).addInnerParam ( v4, v5 ); // invoke-virtual {v14, v4, v5}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 48 */
		 /* move-object/from16 v0, p0 */
		 v4 = this.ctx;
		 v5 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.h;
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).execute ( v4, v5 ); // invoke-virtual {v14, v4, v5}, Lcom/adknowledge/superrewards/web/SRRequest;->execute(Landroid/content/Context;Ljava/lang/String;)Z
		 /* .line 49 */
		 (( com.adknowledge.superrewards.web.SRRequest ) v14 ).getResult ( ); // invoke-virtual {v14}, Lcom/adknowledge/superrewards/web/SRRequest;->getResult()Ljava/lang/String;
		 /* .line 51 */
		 /* .local v18, "xmlresponse":Ljava/lang/String; */
		 /* move-object/from16 v0, v18 */
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setTransactionRef ( v0 ); // invoke-virtual {v1, v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setTransactionRef(Ljava/lang/String;)V
		 /* .line 52 */
		 final String v4 = "srptand"; // const-string v4, "srptand"
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setCustomerKey ( v4 ); // invoke-virtual {v1, v4}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setCustomerKey(Ljava/lang/String;)V
		 /* .line 55 */
		 /* move-object/from16 v0, p0 */
		 v4 = this.zongoffer;
		 (( com.adknowledge.superrewards.model.SROffer ) v4 ).getPricePoints ( ); // invoke-virtual {v4}, Lcom/adknowledge/superrewards/model/SROffer;->getPricePoints()Ljava/util/List;
		 /* .local v8, "i$":Ljava/util/Iterator; */
	 v4 = 	 } // :goto_1
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* check-cast v9, Lcom/adknowledge/superrewards/model/SRPricePoint; */
		 /* .line 56 */
		 /* .local v9, "item":Lcom/adknowledge/superrewards/model/SRPricePoint; */
		 (( com.adknowledge.superrewards.model.SRPricePoint ) v9 ).getEntrypointurl ( ); // invoke-virtual {v9}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getEntrypointurl()Ljava/lang/String;
		 /* .line 57 */
		 /* .local v7, "entryPointUrl":Ljava/lang/String; */
		 final String v4 = "SR"; // const-string v4, "SR"
		 /* new-instance v5, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v19 = "entrypointUrl: "; // const-string v19, "entrypointUrl: "
		 /* move-object/from16 v0, v19 */
		 (( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v4,v5 );
		 /* .line 58 */
		 /* move-object/from16 v0, p0 */
		 v4 = this.pattern;
		 v10 = 		 (( java.lang.String ) v7 ).indexOf ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 /* .line 59 */
		 /* .local v10, "leftStart":I */
		 /* move-object/from16 v0, p0 */
		 v4 = this.pattern;
		 v4 = 		 (( java.lang.String ) v7 ).indexOf ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 /* move-object/from16 v0, p0 */
		 v5 = this.pattern;
		 v5 = 		 (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
		 /* add-int v15, v4, v5 */
		 /* .line 60 */
		 /* .local v15, "rightStart":I */
		 (( java.lang.String ) v7 ).substring ( v15 ); // invoke-virtual {v7, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 java.net.URLDecoder .decode ( v4 );
		 /* .line 61 */
		 /* .local v2, "purchaseKey":Ljava/lang/String; */
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.lang.String ) v7 ).substring ( v4, v10 ); // invoke-virtual {v7, v4, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 /* .line 62 */
		 /* .local v17, "url":Ljava/lang/String; */
		 (( com.adknowledge.superrewards.model.SRPricePoint ) v9 ).getUsAmount ( ); // invoke-virtual {v9}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getUsAmount()Ljava/lang/String;
		 final String v5 = "$"; // const-string v5, "$"
		 final String v19 = ""; // const-string v19, ""
		 /* move-object/from16 v0, v19 */
		 (( java.lang.String ) v4 ).replace ( v5, v0 ); // invoke-virtual {v4, v5, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 v3 = 		 java.lang.Float .parseFloat ( v4 );
		 /* .line 63 */
		 /* .local v3, "amount":F */
		 v4 = 		 (( com.adknowledge.superrewards.model.SRPricePoint ) v9 ).getPoints ( ); // invoke-virtual {v9}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getPoints()I
		 java.lang.Integer .valueOf ( v4 );
		 /* .line 64 */
		 /* .local v13, "quantity":Ljava/lang/Integer; */
		 (( com.adknowledge.superrewards.model.SRPricePoint ) v9 ).getLocalText ( ); // invoke-virtual {v9}, Lcom/adknowledge/superrewards/model/SRPricePoint;->getLocalText()Ljava/lang/String;
		 /* .line 65 */
		 /* .local v6, "label":Ljava/lang/String; */
		 /* move-object/from16 v0, v17 */
		 (( com.zong.android.engine.activities.ZongPaymentRequest ) v1 ).setUrl ( v0 ); // invoke-virtual {v1, v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->setUrl(Ljava/lang/String;)V
		 /* .line 66 */
		 v4 = 		 (( java.lang.Integer ) v13 ).intValue ( ); // invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I
		 final String v5 = "currency"; // const-string v5, "currency"
		 /* invoke-virtual/range {v1 ..v6}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->addPricePoint(Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;)V */
		 /* .line 33 */
	 } // .end local v2 # "purchaseKey":Ljava/lang/String;
} // .end local v3 # "amount":F
} // .end local v6 # "label":Ljava/lang/String;
} // .end local v7 # "entryPointUrl":Ljava/lang/String;
} // .end local v8 # "i$":Ljava/util/Iterator;
} // .end local v9 # "item":Lcom/adknowledge/superrewards/model/SRPricePoint;
} // .end local v10 # "leftStart":I
} // .end local v13 # "quantity":Ljava/lang/Integer;
} // .end local v14 # "request":Lcom/adknowledge/superrewards/web/SRRequest;
} // .end local v15 # "rightStart":I
} // .end local v17 # "url":Ljava/lang/String;
} // .end local v18 # "xmlresponse":Ljava/lang/String;
} // :cond_0
int v4 = 1; // const/4 v4, 0x1
/* goto/16 :goto_0 */
/* .line 69 */
/* .restart local v8 # "i$":Ljava/util/Iterator; */
/* .restart local v14 # "request":Lcom/adknowledge/superrewards/web/SRRequest; */
/* .restart local v18 # "xmlresponse":Ljava/lang/String; */
} // :cond_1
} // .end method
