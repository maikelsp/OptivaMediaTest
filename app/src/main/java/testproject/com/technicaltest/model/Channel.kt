package testproject.com.technicaltest.model

class Channel {
    private var prLevel:Int = 0
    private var attachments:List<Attachments> = ArrayList<Attachments>()
    private var externalChannelId:String = ""
    private var flags:Int = 0
    private var description:String = ""
    private var bitrate:String = ""
    private var interactiveUrl:String = ""
    private var responseElementType:String = ""
    private var number:Int = 0
    private var simultaneousViewsLimit:String = ""
    private var affiliation:String = ""
    private var contentDefinition:String = ""
    private var id:Long = 0
    private var serviceId:String = ""
    private var identifier:String = ""
    private var ip:String = ""
    private var prName:String = ""
    private var originalNetworkId:String = ""
    private var encoding:String = ""
    private var url:String = ""
    private var transportStreamId:String = ""
    private var port:Int = 0
    private var sourceType:String = ""
    private var name:String = ""
    private var extrafields:List<ExtraFields> = ArrayList<ExtraFields>()
    private var category:String = ""
    private var longName:String = ""

    public fun getPrLevel() :Int {
        return this.prLevel
    }

    public fun getAttachments() :List<Attachments> {
        return this.attachments
    }

    public fun getExternalChannelId() :String {
        return this.externalChannelId
    }

    public fun getFlags() :Int {
        return this.flags
    }

    public fun getDescription() :String {
        return this.description
    }

    public fun getBitrate() :String {
        return this.bitrate
    }

    public fun getInteractiveUrl() :String {
        return this.interactiveUrl
    }

    public fun getResponseElementType() :String {
        return this.responseElementType
    }

    public fun getNumber() :Int {
        return this.number
    }

    public fun getSimultaneousViewsLimit() :String {
        return this.simultaneousViewsLimit
    }

    public fun getAffiliation() :String {
        return this.affiliation
    }

    public fun getContentDefinition() :String {
        return this.contentDefinition
    }

    public fun getId() :Long {
        return this.id
    }

    public fun getServiceId() :String {
        return this.serviceId
    }

    public fun getIp() :String {
        return this.ip
    }

    public fun getPrName() :String {
        return this.prName
    }

    public fun getOriginalNetworkId() :String {
        return this.originalNetworkId
    }

    public fun getEncoding() :String {
        return this.encoding
    }

    public fun getUrl() :String {
        return this.url
    }

    public fun getTransportStreamId() :String {
        return this.transportStreamId
    }

    public fun getIdentifier() :String {
        return this.identifier
    }

    public fun getPort() :Int {
        return this.port
    }

    public fun getSourceType() :String {
        return this.sourceType
    }


    public fun getName() :String {
        return this.name
    }


    public fun getExtrafields() :List<ExtraFields> {
        return this.extrafields
    }

    public fun getCategory() :String {
        return this.category
    }

    public fun getLongName() :String {
        return this.longName
    }
}