public class com.jumptap.adtag.JtAdWidgetSettingsFactory {
	 /* .source "JtAdWidgetSettingsFactory.java" */
	 /* # static fields */
	 private static com.jumptap.adtag.JtAdWidgetSettings widgetSettings;
	 /* # direct methods */
	 static com.jumptap.adtag.JtAdWidgetSettingsFactory ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 private com.jumptap.adtag.JtAdWidgetSettingsFactory ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 public static com.jumptap.adtag.JtAdWidgetSettings createWidgetSettings ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 24 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 28 */
		 /* .local v0, "retInstance":Lcom/jumptap/adtag/JtAdWidgetSettings; */
		 v1 = com.jumptap.adtag.JtAdWidgetSettingsFactory.widgetSettings;
		 /* if-nez v1, :cond_0 */
		 /* .line 29 */
		 /* new-instance v1, Lcom/jumptap/adtag/JtAdWidgetSettings; */
		 /* invoke-direct {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;-><init>()V */
		 /* .line 30 */
		 v0 = com.jumptap.adtag.JtAdWidgetSettingsFactory.widgetSettings;
		 /* .line 36 */
	 } // :goto_0
	 /* .line 33 */
} // :cond_0
v1 = com.jumptap.adtag.JtAdWidgetSettingsFactory.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).copy ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->copy()Lcom/jumptap/adtag/JtAdWidgetSettings;
} // .end method
