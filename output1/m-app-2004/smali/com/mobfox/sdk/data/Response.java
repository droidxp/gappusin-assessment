public class com.mobfox.sdk.data.Response {
	 /* .source "Response.java" */
	 /* # instance fields */
	 private Integer bannerHeight;
	 private Integer bannerWidth;
	 private com.mobfox.sdk.data.ClickType clickType;
	 private java.lang.String clickUrl;
	 private java.lang.String imageUrl;
	 private Integer refresh;
	 private Boolean scale;
	 private Boolean skipPreflight;
	 private java.lang.String text;
	 private com.mobfox.sdk.AdType type;
	 private com.mobfox.sdk.data.UrlType urlType;
	 /* # direct methods */
	 public com.mobfox.sdk.data.Response ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getBannerHeight ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 36 */
		 /* iget v0, p0, Lcom/mobfox/sdk/data/Response;->bannerHeight:I */
	 } // .end method
	 public Integer getBannerWidth ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 /* iget v0, p0, Lcom/mobfox/sdk/data/Response;->bannerWidth:I */
	 } // .end method
	 public com.mobfox.sdk.data.ClickType getClickType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 60 */
		 v0 = this.clickType;
	 } // .end method
	 public java.lang.String getClickUrl ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 68 */
		 v0 = this.clickUrl;
	 } // .end method
	 public java.lang.String getImageUrl ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 v0 = this.imageUrl;
	 } // .end method
	 public Integer getRefresh ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 84 */
		 /* iget v0, p0, Lcom/mobfox/sdk/data/Response;->refresh:I */
	 } // .end method
	 public java.lang.String getText ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 52 */
		 v0 = this.text;
	 } // .end method
	 public com.mobfox.sdk.AdType getType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 20 */
		 v0 = this.type;
	 } // .end method
	 public com.mobfox.sdk.data.UrlType getUrlType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 76 */
		 v0 = this.urlType;
	 } // .end method
	 public Boolean isScale ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 92 */
		 /* iget-boolean v0, p0, Lcom/mobfox/sdk/data/Response;->scale:Z */
	 } // .end method
	 public Boolean isSkipPreflight ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 100 */
		 /* iget-boolean v0, p0, Lcom/mobfox/sdk/data/Response;->skipPreflight:Z */
	 } // .end method
	 public void setBannerHeight ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "bannerHeight" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* iput p1, p0, Lcom/mobfox/sdk/data/Response;->bannerHeight:I */
		 /* .line 41 */
		 return;
	 } // .end method
	 public void setBannerWidth ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "bannerWidth" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* iput p1, p0, Lcom/mobfox/sdk/data/Response;->bannerWidth:I */
		 /* .line 33 */
		 return;
	 } // .end method
	 public void setClickType ( com.mobfox.sdk.data.ClickType p0 ) {
		 /* .locals 0 */
		 /* .param p1, "clickType" # Lcom/mobfox/sdk/data/ClickType; */
		 /* .prologue */
		 /* .line 64 */
		 this.clickType = p1;
		 /* .line 65 */
		 return;
	 } // .end method
	 public void setClickUrl ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "clickUrl" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 72 */
		 this.clickUrl = p1;
		 /* .line 73 */
		 return;
	 } // .end method
	 public void setImageUrl ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "imageUrl" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 48 */
		 this.imageUrl = p1;
		 /* .line 49 */
		 return;
	 } // .end method
	 public void setRefresh ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "refresh" # I */
		 /* .prologue */
		 /* .line 88 */
		 /* iput p1, p0, Lcom/mobfox/sdk/data/Response;->refresh:I */
		 /* .line 89 */
		 return;
	 } // .end method
	 public void setScale ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .param p1, "scale" # Z */
		 /* .prologue */
		 /* .line 96 */
		 /* iput-boolean p1, p0, Lcom/mobfox/sdk/data/Response;->scale:Z */
		 /* .line 97 */
		 return;
	 } // .end method
	 public void setSkipPreflight ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .param p1, "skipPreflight" # Z */
		 /* .prologue */
		 /* .line 104 */
		 /* iput-boolean p1, p0, Lcom/mobfox/sdk/data/Response;->skipPreflight:Z */
		 /* .line 105 */
		 return;
	 } // .end method
	 public void setText ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 56 */
		 this.text = p1;
		 /* .line 57 */
		 return;
	 } // .end method
	 public void setType ( com.mobfox.sdk.AdType p0 ) {
		 /* .locals 0 */
		 /* .param p1, "adType" # Lcom/mobfox/sdk/AdType; */
		 /* .prologue */
		 /* .line 24 */
		 this.type = p1;
		 /* .line 25 */
		 return;
	 } // .end method
	 public void setUrlType ( com.mobfox.sdk.data.UrlType p0 ) {
		 /* .locals 0 */
		 /* .param p1, "urlType" # Lcom/mobfox/sdk/data/UrlType; */
		 /* .prologue */
		 /* .line 80 */
		 this.urlType = p1;
		 /* .line 81 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 109 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Response [refresh="; // const-string v1, "Response [refresh="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/mobfox/sdk/data/Response;->refresh:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", type="; // const-string v1, ", type="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.type;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ", bannerWidth="; // const-string v1, ", bannerWidth="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/mobfox/sdk/data/Response;->bannerWidth:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", bannerHeight="; // const-string v1, ", bannerHeight="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lcom/mobfox/sdk/data/Response;->bannerHeight:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", text="; // const-string v1, ", text="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.text;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ", imageUrl="; // const-string v1, ", imageUrl="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.imageUrl;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ", clickType="; // const-string v1, ", clickType="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.clickType;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ", clickUrl="; // const-string v1, ", clickUrl="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.clickUrl;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ", urlType="; // const-string v1, ", urlType="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.urlType;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ", scale="; // const-string v1, ", scale="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-boolean v1, p0, Lcom/mobfox/sdk/data/Response;->scale:Z */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 final String v1 = ", skipPreflight="; // const-string v1, ", skipPreflight="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-boolean v1, p0, Lcom/mobfox/sdk/data/Response;->skipPreflight:Z */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
