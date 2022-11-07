class de.nurogames.android.ticb.base.tinysanta$TinyBeePurchaseObserver extends de.nurogames.android.ticb.base.PurchaseObserver {
	 /* .source "tinysanta.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "TinyBeePurchaseObserver" */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.tinysanta this$0; //synthetic
/* # direct methods */
public de.nurogames.android.ticb.base.tinysanta$TinyBeePurchaseObserver ( ) {
/* .locals 0 */
/* .param p2, "handler" # Landroid/os/Handler; */
/* .prologue */
/* .line 889 */
this.this$0 = p1;
/* .line 890 */
/* invoke-direct {p0, p1, p2}, Lde/nurogames/android/ticb/base/PurchaseObserver;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V */
/* .line 891 */
return;
} // .end method
/* # virtual methods */
public void onBillingSupported ( Boolean p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "supported" # Z */
/* .param p2, "type" # Ljava/lang/String; */
/* .prologue */
/* .line 895 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 final String v0 = "inapp"; // const-string v0, "inapp"
	 v0 = 	 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 896 */
	 } // :cond_0
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 897 */
		 v0 = this.this$0;
		 de.nurogames.android.ticb.base.tinysanta .access$0 ( v0 );
		 /* .line 900 */
	 } // :cond_1
	 return;
} // .end method
public void onPurchaseStateChange ( de.nurogames.android.ticb.base.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
	 /* .locals 8 */
	 /* .param p1, "purchaseState" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
	 /* .param p2, "itemId" # Ljava/lang/String; */
	 /* .param p3, "quantity" # I */
	 /* .param p4, "purchaseTime" # J */
	 /* .param p6, "developerPayload" # Ljava/lang/String; */
	 /* .prologue */
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 905 */
	 v3 = de.nurogames.android.ticb.base.Consts$PurchaseState.PURCHASED;
	 /* if-ne p1, v3, :cond_1 */
	 /* .line 907 */
	 /* new-instance v1, Ljava/util/HashMap; */
	 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
	 /* .line 908 */
	 /* .local v1, "data1":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
	 final String v3 = "item"; // const-string v3, "item"
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p2 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v5 = ", "; // const-string v5, ", "
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( de.nurogames.android.ticb.base.Consts$PurchaseState ) p1 ).toString ( ); // invoke-virtual {p1}, Lde/nurogames/android/ticb/base/Consts$PurchaseState;->toString()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 909 */
	 v3 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_20_PURCHASED_INAPP_ITEM_NAME;
	 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v3,v1,v6 );
	 /* .line 912 */
	 final String v3 = "character_pack"; // const-string v3, "character_pack"
	 v3 = 	 (( java.lang.String ) p2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 /* if-nez v3, :cond_0 */
	 final String v3 = "level_pack"; // const-string v3, "level_pack"
	 v3 = 	 (( java.lang.String ) p2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 /* if-nez v3, :cond_0 */
	 final String v3 = "level_and_character_pack"; // const-string v3, "level_and_character_pack"
	 v3 = 	 (( java.lang.String ) p2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( v3 != null) { // if-eqz v3, :cond_2
		 /* .line 913 */
	 } // :cond_0
	 /* new-instance v0, Ljava/util/HashMap; */
	 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
	 /* .line 914 */
	 /* .local v0, "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
	 final String v3 = "itemID"; // const-string v3, "itemID"
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( p2 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v5 = ", "; // const-string v5, ", "
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 915 */
	 v3 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_04_UPGRADED_TO_PRO;
	 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v3,v0,v6 );
	 /* .line 922 */
} // :goto_0
v3 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$1 ( v3 );
/* .line 926 */
v4 = de.nurogames.android.ticb.base.tinysanta.CATALOG;
/* array-length v5, v4 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-lt v3, v5, :cond_3 */
/* .line 933 */
} // .end local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v1 # "data1":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
} // :cond_1
v3 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$2 ( v3 );
v4 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$1 ( v4 );
(( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) v3 ).setOwnedItems ( v4 ); // invoke-virtual {v3, v4}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->setOwnedItems(Ljava/util/Set;)V
/* .line 934 */
v3 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$3 ( v3 );
/* .line 935 */
return;
/* .line 917 */
/* .restart local v1 # "data1":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
} // :cond_2
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 918 */
/* .restart local v0 # "data":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v3 = "itemID"; // const-string v3, "itemID"
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = ", "; // const-string v5, ", "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 919 */
v3 = de.nurogames.android.ticb.base.core.FlurryAnalyticsManager.EVENT_06_PURCHASED_CHARACTER;
de.nurogames.android.ticb.base.core.FlurryAnalyticsManager .logEvent ( v3,v0,v6 );
/* .line 926 */
} // :cond_3
/* aget-object v2, v4, v3 */
/* .line 927 */
/* .local v2, "e":Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry; */
v6 = this.sku;
v6 = (( java.lang.String ) v6 ).equals ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 928 */
v6 = this.managed;
v7 = de.nurogames.android.ticb.base.tinysanta$Managed.SUBSCRIPTION;
(( de.nurogames.android.ticb.base.tinysanta$Managed ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Lde/nurogames/android/ticb/base/tinysanta$Managed;->equals(Ljava/lang/Object;)Z
/* .line 926 */
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
public void onRequestPurchaseResponse ( de.nurogames.android.ticb.base.BillingService$RequestPurchase p0, de.nurogames.android.ticb.base.Consts$ResponseCode p1 ) {
/* .locals 1 */
/* .param p1, "request" # Lde/nurogames/android/ticb/base/BillingService$RequestPurchase; */
/* .param p2, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 942 */
v0 = de.nurogames.android.ticb.base.Consts$ResponseCode.RESULT_OK;
/* if-ne p2, v0, :cond_1 */
/* .line 955 */
} // :cond_0
} // :goto_0
return;
/* .line 946 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.Consts$ResponseCode.RESULT_USER_CANCELED;
/* if-ne p2, v0, :cond_0 */
} // .end method
public void onRestoreTransactionsResponse ( de.nurogames.android.ticb.base.BillingService$RestoreTransactions p0, de.nurogames.android.ticb.base.Consts$ResponseCode p1 ) {
/* .locals 4 */
/* .param p1, "request" # Lde/nurogames/android/ticb/base/BillingService$RestoreTransactions; */
/* .param p2, "responseCode" # Lde/nurogames/android/ticb/base/Consts$ResponseCode; */
/* .prologue */
/* .line 959 */
v2 = de.nurogames.android.ticb.base.Consts$ResponseCode.RESULT_OK;
/* if-ne p2, v2, :cond_0 */
/* .line 965 */
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
(( de.nurogames.android.ticb.base.tinysanta ) v2 ).getPreferences ( v3 ); // invoke-virtual {v2, v3}, Lde/nurogames/android/ticb/base/tinysanta;->getPreferences(I)Landroid/content/SharedPreferences;
/* .line 966 */
/* .local v1, "prefs":Landroid/content/SharedPreferences; */
/* .line 967 */
/* .local v0, "edit":Landroid/content/SharedPreferences$Editor; */
final String v2 = "db_initialized"; // const-string v2, "db_initialized"
int v3 = 1; // const/4 v3, 0x1
/* .line 968 */
/* .line 974 */
} // .end local v0 # "edit":Landroid/content/SharedPreferences$Editor;
} // .end local v1 # "prefs":Landroid/content/SharedPreferences;
} // :cond_0
return;
} // .end method
