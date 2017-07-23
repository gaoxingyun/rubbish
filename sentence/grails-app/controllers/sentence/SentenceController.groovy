package sentence

import grails.codegen.model.Model
import org.springframework.web.servlet.ModelAndView

class SentenceController {

    def dbService

    def index() {
        redirect(action : "page")
    }

    def page(){

        def sentence = dbService.getSentence(1)
        return [sentence : sentence]
    }
}
