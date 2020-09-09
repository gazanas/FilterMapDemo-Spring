package com.filtermap.librarydemo.Controllers;

import com.filtermap.librarydemo.Repositories.BookRepository;
import org.filtermap.FilterMapSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
@RequestMapping(path = "/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @PersistenceContext
    EntityManager entityManager;

    @GetMapping(path = "/show")
    public String show(@RequestParam MultiValueMap book, Model model) {

        model.addAttribute("books", bookRepository.filterBooks(book,
                                            entityManager,
                                            FilterMapSort.instance("title")));

        model.addAttribute("titles", bookRepository.findAllTitles());

        model.addAttribute("published", bookRepository.findAllPublished());

        return "index";
    }
}
